package com.baidusoso.androidutils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;

/**
 * Created by masel on 2016/7/6.
 */
public class ManifestUtils {

    /**
     * Get meta value by meta key from android manifest file.
     */
    public static String getMetaValue(Context context, String metaKey) {
        Bundle metaData = null;
        String metaValue = null;
        if (!TextUtils.isEmpty(metaKey)) {

            try {
                ApplicationInfo ai = context.getPackageManager()
                        .getApplicationInfo(context.getPackageName(),
                                PackageManager.GET_META_DATA);
                if (null != ai) {
                    metaData = ai.metaData;
                }
                if (null != metaData) {
                    metaValue = metaData.getString(metaKey);
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return metaValue;
    }
}
