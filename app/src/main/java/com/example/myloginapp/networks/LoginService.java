package com.example.myloginapp.networks;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.GET;

public class LoginService {
    private final String BASE_URL = "http://localhost:8080/";
    private Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(ScalarsConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            ;
    public interface MarsApiService {
        /**
         * Returns a [List] of [MarsPhoto] and this method can be called from a Coroutine.
         * The @GET annotation indicates that the "photos" endpoint will be requested with the GET
         * HTTP method
         */
        @GET("photos")
        String getPhotos();
    }
    public class MarsApi {
        public MarsApiService retrofitService() {
            return retrofit.create(MarsApiService.class);
        }
    }
}
