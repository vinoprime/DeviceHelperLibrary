package com.vinmacro.devicehelperlibrary;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;

public class DeviceHelperModule {

    private static DeviceHelperModule deviceHelperModule;

    private DeviceHelperModule() {

    }

    public static DeviceHelperModule getInstance() {
        if (deviceHelperModule == null) deviceHelperModule = new DeviceHelperModule();
        return deviceHelperModule;
    }


    public String getDeviceID(Context context) {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), android.provider.Settings.Secure.ANDROID_ID);
    }

    /*Below code keep the screen On until the APP is onSTOP*/
    public void keepScreenOn(Activity activity) {
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }


    public void keepScreenOff(Activity activity) {
        activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    public void makeFullScreen(Activity activity) {
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
