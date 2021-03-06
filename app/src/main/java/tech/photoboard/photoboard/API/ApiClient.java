package tech.photoboard.photoboard.API;

import org.json.JSONObject;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pc1 on 23/10/2016.
 */

public class ApiClient {
    public static final String URL = "http://photoboard.tech";
    public static final String BASE_URL = URL + "/api/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if(retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
    public static Retrofit getClientPool(String url){
        return new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
    }

}