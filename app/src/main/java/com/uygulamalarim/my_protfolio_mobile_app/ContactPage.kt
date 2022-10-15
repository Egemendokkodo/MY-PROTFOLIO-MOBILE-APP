package com.uygulamalarim.my_protfolio_mobile_app

import android.content.ClipData
import android.content.ClipboardManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_contact_page.*


class ContactPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_page)



        copyEmail.setOnClickListener({
            val clipboardManager = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clipData = ClipData.newPlainText("MyData", editTextEmail.text.toString())
            clipboardManager.setPrimaryClip(clipData)
            Toast.makeText(this, "Text copied to clipboard", Toast.LENGTH_LONG).show()
        })
        copyGithub.setOnClickListener({
            val clipboardManager = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clipData = ClipData.newPlainText("MyData", editTextGithub.text.toString())
            clipboardManager.setPrimaryClip(clipData)
            Toast.makeText(this, "Copied to clipboard", Toast.LENGTH_LONG).show()

        })
        copyInstagram.setOnClickListener({
            val clipboardManager = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clipData = ClipData.newPlainText("MyData", editTextInstagram.text.toString())
            clipboardManager.setPrimaryClip(clipData)
            Toast.makeText(this, "Copied to clipboard", Toast.LENGTH_LONG).show()
        })
    }
}