package com.example.json_a;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
@GET("users/akonic")
    Call<content> getJson();
}
