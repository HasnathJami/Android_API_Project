package com.example.apicall;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Methods {
    @GET("posts")
    Call<ArrayList<Model>> getAllData();
}
