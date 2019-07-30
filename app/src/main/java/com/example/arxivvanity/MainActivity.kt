package com.example.arxivvanity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.RuntimeException


class MainActivity : AppCompatActivity() {

    val pattern = "1\\d{3}\\.\\d+".toRegex()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun loadArxivUrl(view: View) {
        val text = this.editText.text.toString()

        val arxivId = pattern.find(text)?.value

        if (arxivId.isNullOrBlank()) {
            // Show error message
            val builder = AlertDialog.Builder(this)
            with (builder) {
                setTitle("Error")
                setMessage("Invalid arxiv url: $text")
                show()
            }

            return
        }

        val url = "https://www.arxiv-vanity.com/papers/$arxivId/"

        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

}
