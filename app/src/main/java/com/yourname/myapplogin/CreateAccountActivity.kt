package com.yourname.myapplogin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CreateAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account) // liên kết tới XML đăng ký

        val etNewEmail = findViewById<EditText>(R.id.etNewEmail)
        val etNewPassword = findViewById<EditText>(R.id.etNewPassword)
        val etConfirmPassword = findViewById<EditText>(R.id.etConfirmPassword)
        val btnCreateAccount = findViewById<Button>(R.id.btnCreateAccount)

        btnCreateAccount.setOnClickListener {
            val email = etNewEmail.text.toString().trim()
            val pass = etNewPassword.text.toString().trim()
            val confirm = etConfirmPassword.text.toString().trim()

            if (email.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
                Toast.makeText(this, "⚠️ Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show()
            } else if (pass != confirm) {
                Toast.makeText(this, "❌ Mật khẩu xác nhận không khớp", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "✅ Tạo tài khoản thành công cho: $email", Toast.LENGTH_SHORT).show()

                // Quay về màn hình đăng nhập sau khi đăng ký
                finish()
            }
        }
    }
}
