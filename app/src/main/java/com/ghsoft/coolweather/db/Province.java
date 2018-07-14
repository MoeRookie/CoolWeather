package com.ghsoft.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by mac on 2018/7/14.
 */

public class Province extends DataSupport {
    private int id; // id(每个实体类中都应该有)
    private String provinceName; // 省名
    private int provinceCode; // 省代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
