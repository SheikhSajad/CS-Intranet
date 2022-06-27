package com.cloudsufi.csintranet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    private lateinit var leave_policy: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        leave_policy = findViewById(R.id.leave_policy)

        setUpOnClickListener()
    }

    private fun setUpOnClickListener() {

        leave_policy.setOnClickListener {
            val intent = Intent(this, PdfViewActivity::class.java)
            intent.putExtra("ViewType", "assets")
            startActivity(intent)
        }
    }

}
