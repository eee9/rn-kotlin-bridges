// MxRNPackages.java

package com.mxjpackages;

import android.util.Log;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MxJPackages implements ReactPackage {
    private static String MODULE_NAME = "MxJPackages";
    private static String TAG = "Mx " + MODULE_NAME;
    private static void mLog(String msg) {
        Log.d(TAG, msg);
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        mLog("In createViewManagers()");
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        mLog("In createNativeModules()");
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new MxJToast(reactContext));
        return modules;
    }

}
