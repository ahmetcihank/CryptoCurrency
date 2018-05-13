package com.example.software02.cryptocurrency.Utility;

import com.example.software02.cryptocurrency.Interface.ListService;
import com.example.software02.cryptocurrency.Retrofit.CryptoClient;

/**
 * Created by SOFTWARE02 on 3/16/2018.
 */

public class Helper {

    private static final String BASE_URL="https://api.coinmarketcap.com";


    public static ListService getNewsService()
    {
        return CryptoClient.getClient(BASE_URL).create(ListService.class);
    }




}
