package com.example.android.osmdroidofflinedemo;

import android.app.Activity;
import android.os.Bundle;

import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

public class MainActivity extends Activity {

    public static final GeoPoint GLODON = new GeoPoint(40.044771, 116.277071);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView mapView = (MapView) findViewById(R.id.mapview);
        mapView.setClickable(true);
        mapView.setBuiltInZoomControls(true);
        mapView.setMultiTouchControls(true);
        mapView.setUseDataConnection(false);
        mapView.setMaxZoomLevel(null);
        // attention!!: need to rename tile folder in .zip file to "CycleMap";
        mapView.setTileSource(TileSourceFactory.CYCLEMAP);

        IMapController mapViewController = mapView.getController();
        mapViewController.setZoom(15);
        mapViewController.setCenter(GLODON);
    }

}
