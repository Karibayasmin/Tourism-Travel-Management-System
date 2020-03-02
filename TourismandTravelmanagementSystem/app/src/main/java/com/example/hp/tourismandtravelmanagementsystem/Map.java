package com.example.hp.tourismandtravelmanagementsystem;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class Map extends FragmentActivity implements OnMapReadyCallback {


    private GoogleMap mMap;
    // Might be null if Google Play services APK is not available.

    private final int[] MAP_TYPES = {GoogleMap.MAP_TYPE_HYBRID};
    private int curMapTypeIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        SupportMapFragment mapFragment=(SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        LatLng bangladesh = new LatLng(22.845641, 89.54032789999997);
        mMap.addMarker(new MarkerOptions().
                position(bangladesh).
                title("Marker in Khulna").
                icon(BitmapDescriptorFactory.fromResource(R.drawable.redicon)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bangladesh, 18));

        mMap.addPolyline(new PolylineOptions().add(
                        bangladesh
                )
                        .width(10)
                        .color(Color.RED)

        );
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
//        mMap.setMyLocationEnabled(true);

    }
}


