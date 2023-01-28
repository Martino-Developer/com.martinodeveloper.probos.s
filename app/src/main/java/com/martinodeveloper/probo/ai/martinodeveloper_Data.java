package com.martinodeveloper.probo.ai;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.io.File;

public class martinodeveloper_Data extends Application {

    public static final String TAG = martinodeveloper_Data.class.getSimpleName();
    private static martinodeveloper_Data mInstance;
    private static Context context;
    private File mProfile;
    public static Activity smsActivity = null;
    public static Activity RegitationActivity = null;


    public static synchronized martinodeveloper_Data getInstance() {
        return mInstance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        context = getApplicationContext();
    }

    public static boolean isNetworkAvailable(Context context) {
        boolean isNetworkAvailable = false;
        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();

        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            isNetworkAvailable = true;
        }

        return isNetworkAvailable;
    }




}