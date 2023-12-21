package com.greenfuturz;

import static com.facebook.react.bridge.UiThreadUtil.runOnUiThread;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.os.AsyncTask;
import android.widget.TextView;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;


import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.zebra.rfid.api3.ACCESS_OPERATION_CODE;
import com.zebra.rfid.api3.ACCESS_OPERATION_STATUS;
import com.zebra.rfid.api3.Antennas;
import com.zebra.rfid.api3.ENUM_TRANSPORT;
import com.zebra.rfid.api3.ENUM_TRIGGER_MODE;
import com.zebra.rfid.api3.HANDHELD_TRIGGER_EVENT_TYPE;
import com.zebra.rfid.api3.INVENTORY_STATE;
import com.zebra.rfid.api3.InvalidUsageException;
import com.zebra.rfid.api3.OperationFailureException;
import com.zebra.rfid.api3.RFIDReader;
import com.zebra.rfid.api3.ReaderDevice;
import com.zebra.rfid.api3.Readers;
import com.zebra.rfid.api3.RfidEventsListener;
import com.zebra.rfid.api3.RfidReadEvents;
import com.zebra.rfid.api3.RfidStatusEvents;
import com.zebra.rfid.api3.SESSION;
import com.zebra.rfid.api3.SL_FLAG;
import com.zebra.rfid.api3.START_TRIGGER_TYPE;
import com.zebra.rfid.api3.STATUS_EVENT_TYPE;
import com.zebra.rfid.api3.STOP_TRIGGER_TYPE;
import com.zebra.rfid.api3.TagData;
import com.zebra.rfid.api3.TriggerInfo;

import java.util.ArrayList;

/**
 * Class for integration with ContentInsights SDK tracker
 */
public class RFIDSDKModule extends ReactContextBaseJavaModule {

    RFIDHandler rfidHandler;
    public final ReactApplicationContext contexts;
    final static String TAG = "RFID_SAMPLE";
    private RFIDHandler.ReadTagEvents readTagEventsObj;

    /**
     * Class constructor
     *
     * @param context  Application context
     * @param domainId Domain id for module
     */
    RFIDSDKModule(ReactApplicationContext context, int domainId) {
        super(context);
        this.contexts = context;
    }

    /**
     * Get name of the module, to be used in ReactNative as
     * NativeModules.{module_name}
     */
    @Override
    @NonNull
    public String getName() {
        return "RFIDSDKModule";
    }

    /**
     * Start recording attention time
     */

    @ReactMethod
    public void init() {
        rfidHandler = new RFIDHandler(contexts);    
         
    }

     @ReactMethod
     public void getAvailableDevices() {
        rfidHandler.availableDevices(); 
     }

    @ReactMethod
    public void connectRFIDReader(String readerName) {
        for (ReaderDevice device : RFIDHandler.availableRFIDReaderList) {
            if (device.getName().equals(readerName)) {
                RFIDHandler.readerDevice = device;
                RFIDHandler.reader = device.getRFIDReader();
                break;
            }
        }
       rfidHandler.new ConnectTheReader().execute();
    }

    @ReactMethod
    public void disconnectRFIDReader(Promise promise) {
     String status = rfidHandler.disconnect();
     if (status == "Disconnected") {
        promise.resolve("Disconnected");
     } else {
        promise.resolve("No reader connected");
     }
    }

    @ReactMethod
    public void dispose() {
        rfidHandler.dispose();
    }

    @ReactMethod
    public void clearTagsInDb() {
        rfidHandler.reader.Actions.purgeTags();
    }

    @ReactMethod
     public void ConfigureReader() {
        rfidHandler.ConfigureReader();
    }

    @ReactMethod 
    public void readTagEvents(String event, Promise promise) {

        readTagEventsObj = rfidHandler.new ReadTagEvents(promise);
 
        if (event.equals("Listen")) {
            readTagEventsObj.listenEvent = true;
            readTagEventsObj.start();
        } else {
            readTagEventsObj.listenEvent = false;
            readTagEventsObj.start();
        }

    }

}