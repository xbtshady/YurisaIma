package com.example.administrator.yurisaima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.administrator.yurisaima.Client.GetHtml;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    GetHtml getHtml = new GetHtml("https://twitter.com/baby_yurisa");
                    Log.d("html",getHtml.html());
                    Document doc = Jsoup.parse(getHtml.html());
                    Elements elements1 = doc.select(".AdaptiveMedia-photoContainer");
                    Log.d("html"," " + elements1.size());
                    for (int j = 0; j < elements1.size(); j++) {
                        Log.d("html",elements1.get(j).attr("data-image-url"));
                    }
                }catch (Exception e){
                    System.out.print("Exception");
                }

            }
        }).start();

    }
}
