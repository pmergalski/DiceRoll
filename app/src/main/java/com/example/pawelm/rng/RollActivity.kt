package com.example.pawelm.rng

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_roll.*
import java.util.*

class RollActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roll)

        var chosen = intent.extras.get("dice")

        if(chosen == 6) {
            roll_d6()
        }

        roll_again_btn.setOnClickListener {
            roll_d6()
        }
    }


    private fun roll_d6() {
        val random = Random()
        val roll = random.nextInt(6) + 1
        when (roll) {
            1 -> roll_iV.setImageResource(R.drawable.d6_1)
            2 -> roll_iV.setImageResource(R.drawable.d6_2)
            3 -> roll_iV.setImageResource(R.drawable.d6_3)
            4 -> roll_iV.setImageResource(R.drawable.d6_4)
            5 -> roll_iV.setImageResource(R.drawable.d6_5)
            6 -> roll_iV.setImageResource(R.drawable.d6_6)
        }
    }
}
