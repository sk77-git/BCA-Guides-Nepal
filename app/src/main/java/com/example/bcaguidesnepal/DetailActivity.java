package com.example.bcaguidesnepal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView textView;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        webView=findViewById(R.id.webView);
        //textView=findViewById(R.id.bookView);
        getSupportActionBar().setTitle(getIntent().getExtras().getString("subject"));
        int position=getIntent().getIntExtra("sub_key",77);



        if (position==0)
        {
            webView.loadUrl("file:///android_asset/computer.html");
        }
        if (position==1)
        {
            webView.loadUrl("file:///android_asset/society.html");
        }
        if (position==2)
        {
            webView.loadUrl("file:///android_asset/english1.html");
        }
        if (position==3)
        {
            webView.loadUrl("file:///android_asset/maths1.html");
        }
        if (position==4)
        {
            webView.loadUrl("file:///android_asset/digital.html");
        }
        if (position==5)
        {
            webView.loadUrl("file:///android_asset/c.html");
        }
        if (position==6)
        {
            webView.loadUrl("file:///android_asset/accounting.html");
        }
        if (position==7)
        {
            webView.loadUrl("file:///android_asset/english2.html");
        }
        if (position==8)
        {
            webView.loadUrl("file:///android_asset/maths2.html");
        }
        if (position==9)
        {
            webView.loadUrl("file:///android_asset/microprocessor.html");
        }

    }
}