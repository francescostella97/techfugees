package com.example.utente.hackaton;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import com.google.android.gms.maps.model.Marker;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.File;

public class Home extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    String[] cat1 = {"Education", "Jobs", "Transfer Money", "Social Life"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, cat1);
        MaterialBetterSpinner materialDesignSpinner = (MaterialBetterSpinner)
                findViewById(R.id.cat1);
        materialDesignSpinner.setAdapter(arrayAdapter);

        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, cat1);
        MaterialBetterSpinner materialDesignSpinner2 = (MaterialBetterSpinner)
                findViewById(R.id.cat2);
        materialDesignSpinner2.setAdapter(arrayAdapter2);

        setTitle("");
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        double lat = 41.902783, lang = 12.496366;
        // Add a marker in Sydney and move the camera
/*
        Latitude: 41°53′48″N   41.89657317
        Longitude: 12°29′18″E   12.48841057
        Distance: 0.9544 km  Bearing: 223.636°
        Latitude: 41°53′38″N   41.89399464
        Longitude: 12°29′43″E   12.4952108
        Distance: 0.9822 km  Bearing: 185.586°
        Latitude: 41°54′25″N   41.9068648
        Longitude: 12°30′21″E   12.5059032
        Distance: 0.9107 km  Bearing: 60.1°
        Latitude: 41°54′12″N   41.90325797
        Longitude: 12°30′02″E   12.50068335
        Distance: 0.3613 km  Bearing: 81.6°
        Latitude: 41°53′42″N   41.89507197
        Longitude: 12°29′49″E   12.49708108
        Distance: 0.8598 km  Bearing: 176.049°
        Latitude: 41°53′58″N   41.89954989
        Longitude: 12°29′27″E   12.49085125
        Distance: 0.5812 km  Bearing: 231.768°
        Latitude: 41°54′01″N   41.90031448
        Longitude: 12°30′18″E   12.50501684
        Distance: 0.767 km  Bearing: 110.976°
        Latitude: 41°53′53″N   41.89805334
        Longitude: 12°29′56″E   12.49891167
        Distance: 0.5668 km  Bearing: 158.166°
        Distance: 0.9113 km  Bearing: 152.954°
        Distance: 0.686 km  Bearing: 282.908°*/

        LatLng rome11 = new LatLng(41.91021462,12.49298996);
        mMap.addMarker(new MarkerOptions().position(rome11).title(""));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(rome11 , 14.0f) );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rome11));

        LatLng rome12 = new LatLng(41.90670856,12.49584128);
        mMap.addMarker(new MarkerOptions().position(rome12).title(""));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(rome12 , 14.0f) );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rome12));

        LatLng rome13 = new LatLng(89496443,12.50219334);
        mMap.addMarker(new MarkerOptions().position(rome13).title(""));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(rome13 , 14.0f) );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rome13));

        LatLng rome14 = new LatLng(41.90416104,12.48828765);
        mMap.addMarker(new MarkerOptions().position(rome14).title(""));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(rome14 , 14.0f) );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rome14));

        LatLng rome15 = new LatLng(41.89548608,12.50137056);
        mMap.addMarker(new MarkerOptions().position(rome15).title(""));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(rome15 , 14.0f) );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rome15));

        LatLng rome = new LatLng(41.902783,12.496366);
        mMap.addMarker(new MarkerOptions().position(rome).title(""));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(rome , 14.0f) );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rome));

        LatLng rome2 = new LatLng(41.90933659,12.50080747);
        mMap.addMarker(new MarkerOptions().position(rome2).title(""));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(rome2 , 14.0f) );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rome2));

        LatLng rome3 = new LatLng(41.90589379,12.48916479);
        mMap.addMarker(new MarkerOptions().position(rome3).title(""));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(rome3 , 14.0f) );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rome3));

        LatLng rome4 = new LatLng(41.90237503,12.4926451);
        mMap.addMarker(new MarkerOptions().position(rome4).title(""));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(rome4 , 14.0f) );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rome4));

        LatLng rome5 = new LatLng(41.89396618,12.49823822);
        mMap.addMarker(new MarkerOptions().position(rome5).title(""));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(rome5 , 14.0f) );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rome5));

        LatLng rome6 = new LatLng(41.90305286,12.48592884);
        mMap.addMarker(new MarkerOptions().position(rome6).title(""));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(rome6 , 14.0f) );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rome6));

        LatLng rome7 = new LatLng(41.89430621,12.49757746);
        mMap.addMarker(new MarkerOptions().position(rome7).title(""));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(rome7 , 14.0f) );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rome7));

        LatLng rome8 = new LatLng(41.8998086,12.49462791);
        mMap.addMarker(new MarkerOptions().position(rome8).title(""));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(rome8 , 14.0f) );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rome8));

        LatLng rome9 = new LatLng(lat,lang);
        mMap.addMarker(new MarkerOptions().position(rome9).title(""));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(rome9 , 14.0f) );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rome9));

        LatLng rome10 = new LatLng(lat,lang);
        mMap.addMarker(new MarkerOptions().position(rome10).title(""));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(rome10 , 14.0f) );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rome10));
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                System.out.println("marker ");
                return true;
            }
        });
    }
}
