package com.example.software02.cryptocurrency.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by SOFTWARE02 on 3/16/2018.
 */

public class CryptoClient
{

    private static Retrofit retrofit = null;
    public static  Retrofit getClient(String url)
    {
        if (retrofit == null)
        {
            retrofit = new Retrofit.Builder().baseUrl(url).
                    addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
