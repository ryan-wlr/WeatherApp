/**
 * Created by R on 10/1/2016.
 */
package net.weatherapp.app.weatherapp.data;

import org.json.JSONObject;

public interface JSONPopulator {
    void populate(JSONObject data);

    JSONObject toJSON();
}
