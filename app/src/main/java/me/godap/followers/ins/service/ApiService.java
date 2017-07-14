package me.godap.followers.ins.service;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Anchorer on 2017/7/14.
 */
public interface ApiService {
    @Headers({
            "x-requested-with: XMLHttpRequest",
            "x-instagram-ajax: 1",
            "content-type: application/x-www-form-urlencoded",
            "accept: */*",
            "user-agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36",
            "x-csrftoken: FrXLjKntIrcTM9lRKqGOmLnfVAXEZ8MV",
            "referer: https://www.instagram.com/",
            "accept-encoding: gzip, deflate, br",
            "accept-language: en-US,en;q=0.8,zh;q=0.6,zh-CN;q=0.4,zh-TW;q=0.2",
            "cookie: mid=WWWNKwAEAAEErjAhzLmndfaroJ2w",
            "cookie: fbm_124024574287414=base_domain=.instagram.com",
            "cookie: ig_vw=881",
            "cookie: ig_pr=1",
            "cookie: fbsr_124024574287414=FqP_VMvB_B0cWIYxhqrbw3nViPbZhUVYfMRZrIv3ZVo.eyJhbGdvcml0aG0iOiJITUFDLVNIQTI1NiIsImNvZGUiOiJBUUQxYUVQUVdrU0dDNWZtLThjMlpnTUdibGgtRHJTWTBTcDVHTTlkeVdBZFNvMHU5RzlIWWF5bHVLZm9xcndMMmFlUEE1RlVxRXFOLUZRWGxwQkJ4UVpOT2lzV0Vzby03VUs0d3Nia0djYXpRRms4UmFUV2NSemw1akh3M3RLY19RdGFxeFd4SDFYME5wOUpXX1huTnZ5V0I2cjdsMkZ0UnEtUWFfQndfeUg0aC1IMGpselNRcGttNUFfSTYwYTJ3ZlozTVpCN3A3N1lYdDVablR3YWZBUlpKMW9PVHgwOE1ybXN2VzRjSURvVl9ROUg3RVBwb1VjYmhETDBRUWJOR21UNUtYNldLUlpBSlVMeFlDU2VjYU8wZkRPQlJ6M0x4Q2FJNkZVSHRJUW5ZQzZ2cDB6aG10TThOQmlPc1RTU2Z4RmNnYXp4bHZNMDJGUG5KLW9NV09UaCIsImlzc3VlZF9hdCI6MTUwMDAyNDEyOCwidXNlcl9pZCI6IjEwMDAwMjYyMTAxNjU3MiJ9",
            "cookie: rur=ASH",
            "cookie: csrftoken=FrXLjKntIrcTM9lRKqGOmLnfVAXEZ8MV"
    })
    @FormUrlEncoded
    @POST("/accounts/login/ajax/")
    Call<JsonObject> login(@Field("username") String username, @Field("password") String password);
}
