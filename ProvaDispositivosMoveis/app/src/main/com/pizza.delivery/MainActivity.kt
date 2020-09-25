package com.pizza.delivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        splashScreen()
    }
    private fun splashScreen(){
        val intent = Intent(this, PageActivity::class.java)

        Handler().postDelayed({
            intent.change()
        },3000)
    }
    private fun Intent.change() {
        startActivity(this)
        finish()
    }
}
