package com.arjungupta08.fakestoredagger.di

import com.arjungupta08.fakestoredagger.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

}