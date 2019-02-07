package com.example.json_a;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static final String BASEURL = "https://api.github.com/";
    public static final Retrofit retrofit=null;
    public static Retrofit getRetrofitInstance()
    {
        if(retrofit==null)
        return new Retrofit.Builder().baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }
}
