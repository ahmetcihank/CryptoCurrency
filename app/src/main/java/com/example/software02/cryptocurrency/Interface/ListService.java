package com.example.software02.cryptocurrency.Interface;

import com.example.software02.cryptocurrency.Model.RootObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SOFTWARE02 on 3/16/2018.
 */

public interface ListService {
    @GET("v1/ticker")
    Call<List<RootObject>> getSources();
}

/*public interface EuroService{

    @GET("v1/ticker/?convert")
}*/
