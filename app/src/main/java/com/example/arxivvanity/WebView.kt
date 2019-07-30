package com.example.arxivvanity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_web_view.*

class WebView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val url = intent.getStringExtra("url")
        Log.i("arxiv-vanity","Visiting url: $url")

        this.webContent.loadUrl(url)
    }
}
