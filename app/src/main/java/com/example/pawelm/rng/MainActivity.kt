package com.example.pawelm.rng

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generate_btn.setOnClickListener {
            var random = Random()
            var errors = false
            if (max_eT.text.toString() == "") {
                max_eT.error = "Can not be empty!"
                errors = true
            }
            if (min_eT.text.toString() == "") {
                min_eT.error = "Can not be empty!"
                errors = true
            }
            if(!errors) {
                var max = max_eT.text.toString().toInt()
                var min = min_eT.text.toString().toInt()

                if (max <= min) {
                    max_eT.error = "Maximum value must be bigger than minimal"
                    min_eT.error = "Maximum value must be bigger than minimal"
                } else
                    random_tV.text = (random.nextInt(max + 1 - min) + min).toString()
            }


        }

        choose_btn.setOnClickListener {
            val intent = Intent(this, chooseActivity::class.java)

            startActivity(intent)
        }
    }
}
