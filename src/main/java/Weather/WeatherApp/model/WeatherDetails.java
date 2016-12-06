package Weather.WeatherApp.model;

import com.google.gson.annotations.SerializedName;

public class WeatherDetails {

    @SerializedName("main")
    String basicWeatherDescription;

    @SerializedName("description")
    String detailedWeatherDescription;

    @SerializedName("icon")
    String weatherIcon;



    public WeatherDetails() {
        // empty constructor
    }

    public String getBasicWeatherDescription() {
        return basicWeatherDescription;
    }

    public String getDetailedWeatherDescription() {
        return detailedWeatherDescription;
    }

    public String getWeatherIcon() {
        return weatherIcon;
    }
}
