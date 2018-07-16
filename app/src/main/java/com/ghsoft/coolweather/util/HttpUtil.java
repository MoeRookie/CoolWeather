package com.ghsoft.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by mac on 2018/7/14.
 */

public class HttpUtil {
    /**
     * 发送网络请求
     * @param address 请求地址
     * @param callback 回调结果
     */
    public static void sendOkHttpRequest(String address, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
