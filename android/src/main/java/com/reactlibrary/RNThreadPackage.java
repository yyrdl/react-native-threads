package com.yyrdl.threads;

import com.facebook.react.ReactPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RNThreadPackage implements ReactPackage {

    private ReactNativeHost reactNativeHost;
    private ReactPackage additionalThreadPackages[];

    public RNThreadPackage(ReactNativeHost reactNativeHost, ReactPackage... additionalThreadPackages) {
        this.reactNativeHost = reactNativeHost;
        this.additionalThreadPackages = additionalThreadPackages;
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {

        List<NativeModule> modules = new ArrayList<>();

        modules.add(new RNThreadModule(reactContext, reactNativeHost, additionalThreadPackages));

        return modules;

    }
}