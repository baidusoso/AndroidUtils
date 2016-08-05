package com.baidusoso.androidutils;

import android.os.Environment;

import java.io.File;

/**
 * Created by masel on 2016/8/5.
 */
public class SDCardUtils {

    private SDCardUtils(){}

    /**
     * Judge sdcard is mounted or not.
     */
    public static boolean isSDCardEnable() {
        return Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState());
    }

    /**
     * Get sdcard path.
     */
    public static String getSDCardPath() {
        return Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator;
    }
}
