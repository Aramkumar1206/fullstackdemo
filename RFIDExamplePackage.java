package com.greenfuturz;

import androidx.annotation.NonNull;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class RFIDExamplePackage implements ReactPackage {

    /**
     * int domainId
     */
    private int domainId;

    /**
     * Class constructor
     *
     * @param domainId Apps domain id in ContentInsights system
     */
    RFIDExamplePackage(int domainId) {
        this.domainId = domainId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public List<NativeModule> createNativeModules(
            @NonNull ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        //We import the module file here
        modules.add(new RFIDSDKModule(reactContext, domainId));

        return modules;
    }

}