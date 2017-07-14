package me.godap.followers.ins.payload;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginPayload {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("phone_id")
    @Expose
    private String phoneId;
    @SerializedName("_csrftoken")
    @Expose
    private String csrftoken;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("device_id")
    @Expose
    private String deviceId;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("login_attempt_account")
    @Expose
    private Integer loginAttemptAccount;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public String getCsrftoken() {
        return csrftoken;
    }

    public void setCsrftoken(String csrftoken) {
        this.csrftoken = csrftoken;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLoginAttemptAccount() {
        return loginAttemptAccount;
    }

    public void setLoginAttemptAccount(Integer loginAttemptAccount) {
        this.loginAttemptAccount = loginAttemptAccount;
    }

    public String getPayload() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

}