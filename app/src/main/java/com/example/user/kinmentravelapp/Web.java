package com.example.user.kinmentravelapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.BundleCompat;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by user on 2019/3/28.
 */

@SuppressLint("ValidFragment")
public class Web extends Fragment {

    private View view;
    private static WebView webview;
    private WebSettings webSettings;
    private Boolean web;

    @SuppressLint("ValidFragment")
    public Web(Boolean web) {
        this.web = web;
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.web, container, false);
        setupComponent();
        setupListener();
        setRecyclerView();
        return view;
    }

    private void setRecyclerView() {
    }

    private void setupListener() {
    }

    private void setupComponent() {
        webview = (WebView) view.findViewById(R.id.webview);
        webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());

        if (web)
            webview.loadUrl("https://hackmd.io/s/S18ngx8OE");
        else
            webview.loadUrl("file:///android_asset/kimen.html");
    }

    public static void onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack();
        }
    }


}
