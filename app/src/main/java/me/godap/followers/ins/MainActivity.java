package me.godap.followers.ins;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.gson.JsonObject;

import me.godap.followers.ins.component.ApiUtils;
import me.godap.followers.ins.component.Consts;
import me.godap.followers.ins.service.ApiService;
import okhttp3.Headers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mUsernameTv, mPwTv;

    private ApiService mApiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mApiService = ApiUtils.getAPIService();
        initViews();
    }

    private void initViews() {
        mUsernameTv = (EditText) findViewById(R.id.username_et);
        mPwTv = (EditText) findViewById(R.id.pw_et);
        findViewById(R.id.login_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_btn: {
                login();
                break;
            }
        }
    }

    private void login() {
        String userName = mUsernameTv.getText().toString();
        String pw = mPwTv.getText().toString();
        mApiService.login(userName, pw).enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                Log.d(Consts.TAG, "Login result: " + response.toString());
                if (response.isSuccessful()) {
                    Log.d(Consts.TAG, "Login Success: " + response.body());
                    Headers headers = response.headers();
                    Log.d(Consts.TAG, "Headers: " + headers.toString());
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.e(Consts.TAG, "Login failed. " + t.toString());
                t.printStackTrace();
            }
        });
    }

}
