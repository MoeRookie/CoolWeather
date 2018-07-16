package com.ghsoft.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by mac on 2018/7/14.
 */

public class County extends DataSupport {
    private int id; // id
    private String countyName; // 县/区名
    private String weatherId; // 天气ID
    private int cityId; // 县/区所属市的ID值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
