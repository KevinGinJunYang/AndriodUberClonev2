package com.kevin.andrioduberclone.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by xtealthz on 26/02/2018.
 */

public interface IGoogleAPI {
    @GET
    Call<String> getPath(@Url String url);

}
