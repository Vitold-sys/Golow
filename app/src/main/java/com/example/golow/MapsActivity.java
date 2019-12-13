package com.example.golow;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {
    private Button button;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        //Button for Weather
        button = findViewById(R.id.Weather);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWeatherActivity();
            }
        });

    }

    public void openWeatherActivity() {
        Intent intent = new Intent(this, WeatherActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item2:
                Toast.makeText(this, "History of my points", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.list_item:
                Toast.makeText(this, "Weather", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
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
    public void onMapReady(GoogleMap googleMap) {

        // Add a marker in Minsk and move the

        mMap = googleMap;

        LatLng moscow = new LatLng(55.751244, 37.618423);
        mMap.addMarker(new MarkerOptions().position(moscow).title("Moscow cordinates " + moscow));
        LatLng warsaw = new LatLng(52.237049, 21.017532);
        mMap.addMarker(new MarkerOptions().position(warsaw).title("Warsaw cordinates " + warsaw));
        LatLng tokyo = new LatLng(35.652832, 139.839478);
        mMap.addMarker(new MarkerOptions().position(tokyo).title("Tokyo cordinates " + tokyo));
        LatLng newyork = new LatLng(40.730610, -73.935242);
        mMap.addMarker(new MarkerOptions().position(newyork).title("New York cordinates " + newyork));
        LatLng losang = new LatLng(34.052235, -118.243683);
        mMap.addMarker(new MarkerOptions().position(losang).title("Los Angeles cordinates " + losang));
        LatLng miami = new LatLng(25.761681, -80.191788);
        mMap.addMarker(new MarkerOptions().position(miami).title("Miami cordinates " + miami));
        LatLng faro = new LatLng(37.019356, -7.930440);
        mMap.addMarker(new MarkerOptions().position(faro).title("Faro  cordinates " + faro));
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(moscow));

    }

    /* private void init() {
         mMap.addMarker(new MarkerOptions()
                 .title("Hello world")
                 .snippet("Additional text"));
     }
 */
    public void ChangePlace(View view) {
        LatLng madrid = new LatLng(40.416775, -3.703790);
        mMap.addMarker(new MarkerOptions().position(madrid).title("Madrid cordinates " + madrid));
        LatLng barcelona = new LatLng(41.390205, 2.154007);
        mMap.addMarker(new MarkerOptions().position(barcelona).title("Barcelona cordinates " + barcelona));
        LatLng rome = new LatLng(41.902782, 12.496366);
        mMap.addMarker(new MarkerOptions().position(rome).title("Rome cordinates " + rome));
        LatLng udine = new LatLng(46.071068, 13.234579);
        mMap.addMarker(new MarkerOptions().position(udine).title("Udine cordinates " + udine));
        LatLng paris = new LatLng(48.864716, 2.349014);
        mMap.addMarker(new MarkerOptions().position(paris).title("Paris cordinates " + paris));
        LatLng milan = new LatLng(45.464664, 9.188540);
        mMap.addMarker(new MarkerOptions().position(milan).title("Milan cordinates " + milan));
        LatLng vienna = new LatLng(48.210033, 16.363449);
        mMap.addMarker(new MarkerOptions().position(vienna).title("Marker cordinates " + vienna));
        LatLng prague = new LatLng(50.073658, 14.418540);
        mMap.addMarker(new MarkerOptions().position(prague).title("Paris  cordinates " + prague));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(vienna));
    }
}
