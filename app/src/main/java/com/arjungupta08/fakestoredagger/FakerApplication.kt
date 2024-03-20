package com.arjungupta08.fakestoredagger

import android.app.Application
import com.arjungupta08.fakestoredagger.di.ApplicationComponent
import com.arjungupta08.fakestoredagger.di.DaggerApplicationComponent

class FakerApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder().build()

    }

}