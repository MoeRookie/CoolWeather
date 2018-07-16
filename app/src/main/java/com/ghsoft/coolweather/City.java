package com.ghsoft.coolweather;

import org.litepal.crud.DataSupport;

/**
 * Created by mac on 2018/7/14.
 */

public class City extends DataSupport {
    private int id; // id
    private String cityName; // 城市名
    private int cityCode; // 市代号
    private int provinceId; // 市所属省的ID值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
