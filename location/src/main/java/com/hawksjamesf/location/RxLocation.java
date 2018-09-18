package com.hawksjamesf.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

import io.reactivex.Observable;

/**
 * Copyright ® $ 2017
 * All right reserved.
 * Code Link : https://github.com/HawksJamesf/SimpleWeather
 *
 * @author: hawks.jamesf
 * @since: 3/2/18
 */

public class RxLocation implements  LocationListener{


    public static final int NETWORK = 0;
    public static final int GPS = 1;

    /**
     *  LocationManager request updates API
     *
     *  1.interval request:
     *
     *  void	requestLocationUpdates(String provider, long minTime, float minDistance, LocationListener listener)
     *  void	requestLocationUpdates(long minTime, float minDistance, Criteria criteria, LocationListener listener, Looper looper)
     *  void	requestLocationUpdates(long minTime, float minDistance, Criteria criteria, PendingIntent intent)
     *  void	requestLocationUpdates(String provider, long minTime, float minDistance, LocationListener listener, Looper looper)
     *  void	requestLocationUpdates(String provider, long minTime, float minDistance, PendingIntent intent)
     *  void	requestSingleUpdate(String provider, PendingIntent intent)
     *
     *  2.single shot request :
     *
     *  void	requestSingleUpdate(String provider, LocationListener listener, Looper looper)
     *  void	requestSingleUpdate(Criteria criteria, LocationListener listener, Looper looper)
     *  void	requestSingleUpdate(Criteria criteria, PendingIntent intent)
     */
    public static  Observable<?> requestLocation(int provider, long minTime, float minDistance){


        return null;
    }

    /**   LocationManager remove  updates API
     * void	removeUpdates(LocationListener listener)
     * void	removeUpdates(PendingIntent intent)
     */
    public static  void removeUpdates(LocationListener listener){


    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
