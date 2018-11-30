package com.example.mohdshadabahmad.myapplication;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;


public class TestActivtiy extends AppCompatActivity  implements GoogleApiClient.ConnectionCallbacks //,OnAddGeofencesResultListener
{

  //  private LocationClient mLocationClient;
        private IntentFilter mIntentFilter;


      /*  static class StoreLocation {
        public LatLng mLatLng;
        public String mId;

        StoreLocation(LatLng latlng, String id) {
            mLatLng = latlng;
            mId = id;
        }*/
   // }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.geolocation_view);

      /*  mLocationClient = new LocationClient(this, this, this);

        // Create a new broadcast receiver to receive updates from the listeners and service
        mGeofenceBroadcastReceiver = new ResturantGeofenceReceiver();

        // Create an intent filter for the broadcast receiver
        mIntentFilter = new IntentFilter();

        // Action for broadcast Intents that report successful addition of geofences
        mIntentFilter.addAction(ACTION_GEOFENCES_ADDED);

        // Action for broadcast Intents that report successful removal of geofences
        mIntentFilter.addAction(ACTION_GEOFENCES_REMOVED);

        // Action for broadcast Intents containing various types of geofencing errors
        mIntentFilter.addAction(ACTION_GEOFENCE_ERROR);

        // All Location Services sample apps use this category
        mIntentFilter.addCategory(CATEGORY_LOCATION_SERVICES);

        createGeofences();

        mRegisterGeofenceButton = (Button)findViewById(R.id.geofence_switch);
        mGeofenceState = CAN_START_GEOFENCE;*/

    }


    @Override
    public void onConnected(@Nullable Bundle bundle) {

    }

    @Override
    public void onConnectionSuspended(int i) {

    }
}
