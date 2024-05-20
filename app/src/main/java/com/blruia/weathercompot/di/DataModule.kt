package com.blruia.weathercompot.di

import com.blruia.weathercompot.network.WeatherApiClient
import com.blruia.weathercompot.repository.SystemDataRepository
import com.blruia.weathercompot.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

private const val BASE_URL = "http://api.weatherapi.com/v1/"

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideRepository(
        apiClient: WeatherApiClient,
        systemDataRepository: SystemDataRepository,
    ): WeatherRepository {
        return WeatherRepository(apiClient, systemDataRepository)
    }

    @Provides
    fun provideOkHttpClient(): OkHttpClient =
        with(OkHttpClient.Builder()) {
            val timeout = 10L
            connectTimeout(timeout, TimeUnit.SECONDS)
            readTimeout(timeout, TimeUnit.SECONDS)

            addNetworkInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })

            build()
        }

    @Provides
    fun provideApiClient(
        httpClient: OkHttpClient,
    ): WeatherApiClient {
        return Retrofit.Builder()
            .client(httpClient)
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(WeatherApiClient::class.java)
    }
}