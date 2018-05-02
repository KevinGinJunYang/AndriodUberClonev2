package com.kevin.andrioduberclone.Common;

import com.kevin.andrioduberclone.Retrofit.IGoogleAPI;
import com.kevin.andrioduberclone.Retrofit.RetrofitClient;

/**
 * Created by xtealthz on 26/02/2018.
 */

public class Common {
    public static final String baseUrl = "https://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPI(){
        return RetrofitClient.getClient(baseUrl).create(IGoogleAPI.class);
    }
}
