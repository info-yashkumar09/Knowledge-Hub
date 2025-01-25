package com.example.knowledge_hub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val cardAndroid=findViewById<CardView>(R.id.cardAndroid)
        val cardIos=findViewById<CardView>(R.id.cardIos)
        val cardWeb=findViewById<CardView>(R.id.cardWeb)
        val cardML=findViewById<CardView>(R.id.cardML)
        val cardBlockChain=findViewById<CardView>(R.id.cardBlockChain)
        val cardWeb3=findViewById<CardView>(R.id.cardWeb3)
        val buttonContact=findViewById<Button>(R.id.btnContact)

        cardAndroid.setOnClickListener {
            //Open next screen that stores data of Android app Dev (by Explicit Intent)
            val intent=Intent(applicationContext, AndroidAppDevDetails::class.java)
            startActivity(intent)
        }
        cardIos.setOnClickListener {
            //Open next screen that stores data of Android app Dev (by Explicit Intent)
            val intent=Intent(applicationContext, IosAppDevDetails::class.java)
            startActivity(intent)
        }
        cardWeb.setOnClickListener {
            //Open next screen that stores data of Android app Dev (by Explicit Intent)
            val intent=Intent(applicationContext, WebDevDetails::class.java)
            startActivity(intent)
        }
        cardML.setOnClickListener {
            //Open next screen that stores data of Android app Dev (by Explicit Intent)
            val intent=Intent(applicationContext, MLDetails::class.java)
            startActivity(intent)
        }
        cardBlockChain.setOnClickListener {
            //Open next screen that stores data of Android app Dev (by Explicit Intent)
            val intent=Intent(applicationContext, BlockChainDevDetails::class.java)
            startActivity(intent)
        }
        cardWeb3.setOnClickListener {
            //Open next screen that stores data of Android app Dev (by Explicit Intent)
            val intent=Intent(applicationContext, Web3Details::class.java)
            startActivity(intent)
        }

        buttonContact.setOnClickListener {
            //Open Call Dialer for Contact (by Implicit Intent)
            val intent= Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:154865")
            startActivity(intent)
        }
    }
}