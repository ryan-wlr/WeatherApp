/**
 * Created by R on 10/1/2016.
 */
package net.weatherapp.app.weatherapp.listener;

import net.weatherapp.app.weatherapp.data.Channel;

public interface WeatherServiceListener {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
