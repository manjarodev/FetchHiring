package com.android.fetchhiringtask.app

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class FetchHiring : Application() {

    companion object {
        var context: Context? = null
    }

    override fun onCreate() {
        super.onCreate()

        context = this@FetchHiring

    }

}