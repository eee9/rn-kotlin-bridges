package com.mxkpackages

import android.util.Log
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import java.util.*

class MxKPackages : ReactPackage {
    private val moduleName = "MxKPackages"
    private val tag = "Mx $moduleName"
    private fun mLog(msg: String) {
        Log.d(tag, msg)
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
        mLog("In createViewManager()")
        return emptyList()
    }

    override fun createNativeModules(
        reactContext: ReactApplicationContext): List<NativeModule> {
        mLog("In createNativeModules()")
        val modules = ArrayList<NativeModule>()

        modules.add(CustomNative(reactContext))

        return modules
    }
}
