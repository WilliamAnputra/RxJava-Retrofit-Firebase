package Weather.WeatherApp.infrastructure;

import android.app.Application;

import com.firebase.client.Firebase;

public class BeastWeatherApplication extends Application {

   public static final String BASE_WEATHER_URL = "http://api.openweathermap.org";
   public static final String BASE_WEAHTER_API = "Your Weather API";

   public static final String BASE_FIRE_BASE_URL = "BaseURL";


   public static final String LOCATION_PREFERENCE = "LOCATION_PREFERENCE";
   public static final String UNIT_PREFERENCE = "UNIT PREFERENCE";

   public static final String BASE_WEATHER_IMAGE = "http://openweathermap.org/img/w/";

   public static final String APP_ID_PREFERENCE = "APP_ID_PREFERENCE";
   public static final String APP_ID = "Your APP id";


   @Override
   public void onCreate() {
      super.onCreate();
      Firebase.setAndroidContext(this);
      Firebase.getDefaultConfig().setPersistenceEnabled(true);

   }
}
