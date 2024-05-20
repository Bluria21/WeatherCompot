package com.blruia.weathercompot.repository

import java.util.Locale
import javax.inject.Inject

class SystemDataRepository
@Inject constructor() {

    fun getSystemLanguage(): String {
        return Locale.getDefault().language
    }
}