package com.example.Cricket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebsiteActivity extends AppCompatActivity {
private WebView webViewNews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        Intent intent = getIntent();
        if (null!=intent){
            String url = intent.getStringExtra("url");
            if(null!=url){
                webViewNews=findViewById(R.id.webView);
                webViewNews.setWebViewClient(new WebViewClient());
                webViewNews.getSettings().setJavaScriptEnabled(true);
                webViewNews.loadUrl(url);
            }
        }
    }

    @Override
    public void onBackPressed() {
        if(webViewNews.canGoBack()){
            webViewNews.goBack();
        }else{
            super.onBackPressed();
        }
    }
}