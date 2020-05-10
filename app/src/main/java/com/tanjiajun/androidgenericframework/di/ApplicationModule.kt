package com.tanjiajun.androidgenericframework.di

import com.tanjiajun.androidgenericframework.AndroidGenericFrameworkConfiguration
import com.tanjiajun.androidgenericframework.data.local.user.UserLocalDataSource
import com.tencent.mmkv.MMKV
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by TanJiaJun on 2020/3/4.
 */
@Suppress("unused")
@Module
open class ApplicationModule {

    @Provides
    @Singleton
    fun provideUserLocalDataSource(): UserLocalDataSource =
            UserLocalDataSource(MMKV.mmkvWithID(
                    AndroidGenericFrameworkConfiguration.MMKV_ID,
                    MMKV.SINGLE_PROCESS_MODE,
                    AndroidGenericFrameworkConfiguration.MMKV_CRYPT_KEY
            ))

}