package com.example.pawelm.rng

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choose.*

class chooseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)


        dice_ok_btn.setOnClickListener {
            val intent = Intent(this, RollActivity::class.java)
            var chosen = 0

            if(d6_btn.isChecked)
                chosen = 6
            else
                chosen = -1

            intent.putExtra("dice", chosen)
            startActivity(intent)
        }
    }
}
