package com.example.norender

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        facebook.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.facebook.com/"))
            startActivity(intent)

        }
        imageButton.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.github.com/"))
            startActivity(intent)

        }
        imageButton2.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.Bitbucket.com/"))
            startActivity(intent)

        }
        imageButton8.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.instagram.com/"))
            startActivity(intent)

        }
        android.setOnClickListener(){
            Intent = Uri.parse("http://www.android.com").let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)

        }
        drible.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.dribble.com/"))
            startActivity(intent)

        }
        google.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.youtube.com/"))
            startActivity(intent)

        }
        googleplus.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.googleplus.com/"))
            startActivity(intent)

        }
        play.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.googleplay.com/"))
            startActivity(intent)

        }
        link.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.linkedin.com/"))
            startActivity(intent)

        }
        skype.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.skype.com/"))
            startActivity(intent)

        }
        twitter.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.twitter.com/"))
            startActivity(intent)

        }
        webview.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.start.ng/"))
            startActivity(intent)

        }
        slack.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("slack://app?team={TEAM_ID}&id={APP_ID}"))
            startActivity(intent)

        }
        whatsapp.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.whatsapp.com/"))
            startActivity(intent)

        }

    }
}
