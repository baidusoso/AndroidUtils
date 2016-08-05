package com.baidusoso.androidutils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.telephony.TelephonyManager;

import java.io.File;

/**
 * Created by masel on 2016/7/5.
 */
public class DeviceUtils {

    private DeviceUtils(){}

    /**
     * Get device id by TELEPHONY_SERVICE.
     */
    public static String getDeviceId(Context context) {
        return ((TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE))
                .getDeviceId();
    }


    /**
     * Get device manufacturer.
     */
    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    /**
     * Get device model.
     */
    public static String getModel() {
        String model = Build.MODEL;
        if (model != null) {
            model = model.trim().replaceAll("\\s*", "");
        }
        return model;
    }
}
