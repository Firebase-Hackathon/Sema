package com.johnsly.sema;

import com.firebase.client.Firebase;

/**
 * Created by root on 7/31/15.
 */
public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
