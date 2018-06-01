package com.example.santiago.proyectofinal.Recursos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.santiago.proyectofinal.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;



public class MapsActivity extends Fragment implements OnMapReadyCallback {

    private GoogleMap nGoogleMap;
    MapView nMapView;
    View nView;

    public MapsActivity ()
    {

    }
    public void onCreate(Bundle savedInstanceState)
    {
       super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        nView= inflater.inflate(R.layout.fragment_maps, container, false);
        return nView;
    }

    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        nMapView= (MapView) nView.findViewById(R.id.map);
        if(nMapView != null)
        {
           nMapView.onCreate(null);
           nMapView.onResume();
           nMapView.getMapAsync(this);
        }
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
        public void onMapReady (GoogleMap googleMap)
        {
            MapsInitializer.initialize(getContext());
            nGoogleMap = googleMap;
            googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);


            // Add a marker in Sydney and move the camera
            LatLng sydney = new LatLng(1.2136100, -77.2811100);
            googleMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney").snippet("Hola"));


            CameraPosition Liberty= CameraPosition.builder().target(new LatLng(1.2136100, -77.2811100)).zoom(20).bearing(0).tilt(45).build();
            googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(Liberty));
        }


}
