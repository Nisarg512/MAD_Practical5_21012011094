package com.example.mad_practical5_21012011094

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val openbrowse: Button = findViewById(R.id.button)
        val editBrowser:EditText = findViewById(R.id.editTextText)
        openbrowse.setOnClickListener{
            openbrowser(editBrowser.text.toString())


        }
        val phone : Button = findViewById(R.id.button2)
        val num:EditText = findViewById((R.id.editTextText2))
        phn.se

    }
    fun openbrowser(url: String)
    {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also {
            startActivity(it)
        }
    }
    fun phn(number:String)
    {
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$number")).also {
            startActivity(it)
        }

    }
    fun calllog()
    {

    }
    fun gallery()
    {

    }
    fun camera()
    {

    }
    fun alarm()
    {

    }
}