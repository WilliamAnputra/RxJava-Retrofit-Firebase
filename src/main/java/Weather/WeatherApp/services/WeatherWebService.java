package Weather.WeatherApp.services;


import Weather.WeatherApp.model.WeatherListModel;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface WeatherWebService {
    @GET("/data/2.5/forecast/daily")
    Observable<WeatherListModel> getWeather(
            @Query("zip") String zip,
            @Query("mode") String mode,
            @Query("units") String units,
            @Query("cnt") String cnt,
            @Query("APPID") String apiKey
    );
}
