package com.example.administrator.yurisaima.Client;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class GetHtml {
    private String url;
    public GetHtml(String url){
        this.url = url;
    }
    public String html() throws IOException{
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(this.url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
