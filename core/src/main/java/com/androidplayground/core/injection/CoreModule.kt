package com.androidplayground.core.injection

import com.androidplayground.core.scheduler.AndroidSchedulerProvider
import com.androidplayground.core.scheduler.SchedulerProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Created by Mostafa Monowar at 03-May-20 6:01 PM
 * monowar1993@gmail.com
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class CoreModule {
    @Binds
    abstract fun bindSchedulerProvider(androidSchedulerProvider: AndroidSchedulerProvider): SchedulerProvider
}
