package com.example.mohdshadabahmad.myapplication;

import android.app.IntentService;
import android.content.Intent;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;

public class ReceiveGeofenceTransitionIntentService extends IntentService {
    /**
     * Sets an identifier for the service
     */
    public ReceiveGeofenceTransitionIntentService() {
        super("ReceiveGeofenceTransitionsIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        // Create a local broadcast Intent
        Intent broadcastIntent = new Intent();

        // Give it the category for all intents sent by the Intent Service
       // broadcastIntent.addCategory(CATEGORY_LOCATION_SERVICES);


        // First check for errors
        GeofencingEvent geofencingEvent = GeofencingEvent.fromIntent(intent);
        if (geofencingEvent.hasError()) {
            // Get the error code with a static method
            int errorCode = geofencingEvent.getErrorCode();
        }
        else {
            // Get the type of transition (entry or exit)
            int transition = geofencingEvent.getGeofenceTransition();

            if ((transition == Geofence.GEOFENCE_TRANSITION_ENTER)  ||
                    (transition == Geofence.GEOFENCE_TRANSITION_EXIT)) {
                    // Post a notification
            }
            else {
                    // handle the error
            }
        }

    }
}