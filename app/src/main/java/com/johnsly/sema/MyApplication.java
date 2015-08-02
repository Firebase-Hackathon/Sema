package com.johnsly.sema;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by njerry on 8/2/15.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
