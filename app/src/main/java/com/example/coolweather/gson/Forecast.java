package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 陈勇劲 on 2017/8/24.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
