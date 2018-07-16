package com.ghsoft.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 使用GSON的前提 - 先将数据对应的实体类创建好
 * Created by mac on 2018/7/16.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
