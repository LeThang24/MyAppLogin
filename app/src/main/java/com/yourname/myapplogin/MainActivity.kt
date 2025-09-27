package com.yourname.myapplogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (email == "admin" && password == "123") {
                Toast.makeText(this, "✅ Đăng nhập thành công", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "❌ Sai tài khoản hoặc mật khẩu", Toast.LENGTH_SHORT).show()
            }
        }

        btnRegister.setOnClickListener {
            // Mở màn hình đăng ký
            val intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }
    }
}
