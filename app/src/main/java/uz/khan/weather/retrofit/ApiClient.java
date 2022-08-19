package uz.khan.weather.retrofit;

import android.util.Base64;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

//    static {
//        System.loadLibrary("45583a9cd9858a7c89dd9283c08568a5");
//    }

  //  public native static  String getApi();

    private static Retrofit retrofit = null;

 //   public static String APIKEY = new String(Base64.decode(getApi(), Base64.DEFAULT));

    public static  Retrofit getClient(){

        if (retrofit == null){

            retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.openweathermap.org/data/2.5/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }


        return retrofit;

    }
}

