package com.cydeo.client;

import com.cydeo.dto.weather.WeatherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://api.weatherstack.com", name = "WEATHER-CLIENT")
public interface WeatherApiClient {
    // http://api.weatherstack.com  --> URL
    // current --> endpoint
    // ?access_key=b8ed0f7ba1467aade8028d795b912185&
    // &
    // query=Helsinki

    @GetMapping("/current")
    WeatherDTO getCurrentWeather(@RequestParam(value = "access_key") String accessKey,
                                 @RequestParam(value = "query") String city);


}
