import com.movtery.zalithlauncher.R
package com.movtery.zalithlauncher.ui.fragment

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class KenifyStealthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kenify_stealth_ui)

        val playButton = findViewById<Button>(R.id.kenify_play_button)
        playButton.setOnClickListener {
            Toast.makeText(this, "Launching Kenify...", Toast.LENGTH_SHORT).show()
        }
    }
}
