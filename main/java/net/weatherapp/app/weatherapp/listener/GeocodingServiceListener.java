/**
 * Created by R on 10/1/2016.
 */
package net.weatherapp.app.weatherapp.listener;

import net.weatherapp.app.weatherapp.data.LocationResult;

public interface GeocodingServiceListener {
    void geocodeSuccess(LocationResult location);

    void geocodeFailure(Exception exception);
}
