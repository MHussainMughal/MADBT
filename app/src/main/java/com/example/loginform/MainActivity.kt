package com.example.loginform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_login = findViewById<Button>(R.id.btn_Log_in)
        val uname = findViewById<TextView>(R.id.txtbx_user_name)
        val upassword = findViewById<TextView>(R.id.txtbx_password)

        btn_login.setOnClickListener {uname.toString()
            val myname: String = "Hussain"
            val mypassword: String = "9211"
            val newname:String=uname.text.toString()
            if (myname == uname.text.toString() && mypassword == upassword.text.toString()) {
                Toast.makeText(this, "Mr. $newname,  You have longged in Successfully ", Toast.LENGTH_LONG)
                    .show()
            }
            else
           {
               Toast.makeText(this, "Failed , user name or password is incorrect", Toast.LENGTH_LONG).show()
           }

        }
    }
    }
