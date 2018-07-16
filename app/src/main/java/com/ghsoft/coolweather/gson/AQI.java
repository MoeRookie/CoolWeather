package com.ghsoft.coolweather.gson;

/**
 * Created by mac on 2018/7/16.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
