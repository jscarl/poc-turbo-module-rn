package com.testnativeproject.hello;

import android.content.Intent;

import androidx.annotation.NonNull;

import com.bcadigital.blu.blunativemodule.caller.BluHelloCallback;
import com.bcadigital.blu.blunativemodule.caller.BluHelloModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Objects;

public class HelloStarterModule extends ReactContextBaseJavaModule {

    HelloStarterModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "HelloStarter";
    }

    @ReactMethod
    void navigateToHelloActivity(String title, Callback result) {
        ReactApplicationContext context = getReactApplicationContext();
        BluHelloModule.Companion.newInstance().openHelloActivity(Objects.requireNonNull(context.getCurrentActivity()),title, new BluHelloCallback() {
            @Override
            public void onSuccess(@NonNull String s, @NonNull String s1) {
                result.invoke(s1);
            }

            @Override
            public void onCancel(@NonNull String s, @NonNull String s1) {
                result.invoke(s1);
            }

            @Override
            public void onLogout(@NonNull String s, @NonNull String s1) {

            }
        });
    }
}
