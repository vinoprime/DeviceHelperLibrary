package com.vinmacro.devicehelperlibrary;

import android.content.Context;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class DeviceHelperModule {

    private Context context;

    public DeviceHelperModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    public Context provideContext() {
        return context;
    }


    @Singleton
    @Provides
    public String getDeviceID(Context context){
        return android.provider.Settings.Secure.getString(context.getContentResolver(), android.provider.Settings.Secure.ANDROID_ID);
    }
}
