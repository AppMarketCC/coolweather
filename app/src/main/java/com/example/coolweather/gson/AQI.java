package com.example.coolweather.gson;

/**
 * Created by 陈勇劲 on 2017/8/24.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
