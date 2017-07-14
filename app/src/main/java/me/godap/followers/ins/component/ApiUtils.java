package me.godap.followers.ins.component;

import me.godap.followers.ins.service.ApiService;

/**
 * Created by Anchorer on 2017/7/14.
 */

public class ApiUtils {

    private ApiUtils() {}

    public static ApiService getAPIService() {
        return RetrofitClient.getClient()
                .create(ApiService.class);
    }

}
