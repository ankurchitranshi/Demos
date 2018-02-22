package com.kiwitech.ardemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;

import com.nexref.visualintuition.sdk.activities.VICameraActivity;
import com.nexref.visualintuition.sdk.config.Config;
import com.nexref.visualintuition.sdk.config.RequestCodes;

/**
 * Created by Ashlesha on 22/2/18.
 */

public class ArProxy {


    public static int getRequestCodeTargetDetected() {
        return RequestCodes.TARGET_DETECTED;
    }

    public static void launchArCamreaScreenForResult(Activity activity, String campaignName, String arEndPoints) {
        if (activity == null) {
            return;
        }
        Intent arIntent = new Intent(activity, VICameraActivity.class);
        arIntent.putExtra(Config.PRELOAD_CAMPAIGN, campaignName);
        arIntent.putExtra(Config.ENDPOINT, arEndPoints);
        activity.startActivityForResult(arIntent, getRequestCodeTargetDetected());
    }


    public static void launchArCamreaScreen(FragmentActivity activity, String campaignName, String arEndPoints) {
        if (activity == null) {
            return;
        }
        Intent arIntent = new Intent(activity, VICameraActivity.class);
        arIntent.putExtra(Config.PRELOAD_CAMPAIGN, campaignName);
        arIntent.putExtra(Config.ENDPOINT, arEndPoints);
        activity.startActivity(arIntent);
    }

}
