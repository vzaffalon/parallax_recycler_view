package com.yimobile.teste.webservice;

import android.content.Context;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.yimobile.teste.controllers.Beer;

import java.util.List;

/**
 * Created by vzaffalon on 09/11/16.
 */

public class WebService {
    private Context context;
    private static String BASE_URL = "http://54.71.21.195/api/v1/";
    private static String API_KEY = "a9HIr9hj0EsjCgyukT4ijw";
    private static String ENDPOINT = "beers/popular_beers?page=1";
    private static String PUBLIC_API_KEY = "public_api_key";

    public WebService(Context context){
        this.context = context;
    }

    public void getDataFromApi(FutureCallback<JsonObject> callback){
        Ion.with(context)
                .load("GET",BASE_URL + ENDPOINT)
                .setHeader(PUBLIC_API_KEY,API_KEY)
                .asJsonObject()
                .setCallback(callback);
    }
}
