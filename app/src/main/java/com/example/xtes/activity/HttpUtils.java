package com.example.xtes.activity;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.UUID;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HttpUtils {
    MediaType mediaType=MediaType.parse("text/x-markdown;charset=utf-8");
    String requestContent="I am kk";
    RequestBody requestBody=RequestBody.create(mediaType,requestContent);

    OkHttpClient client = new OkHttpClient();
    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    public String login(String url, String username,String password) throws IOException {

        JSONObject json = new JSONObject();
        try {
            json.put("username", username);
            json.put("password", password);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        RequestBody requestBody = RequestBody.create(JSON, String.valueOf(json));
        //RequestBody formBody = new FormEncodingBuilder()

        Request request = new Request.Builder()

                .url("http://47.106.237.169:8080/trading_platform/login.do")
                .post(requestBody)
                .build();

        Response response = client.newCall(request).execute();

        String result = response.body().string();

        return result;


    }


    public String bolwingJson(String username, String password) {
        return "{'username'" + username + "," + "'password'" + password + "}";
        //     "{'username':" + username + ","+"'password':"+password+"}";
    }


}
