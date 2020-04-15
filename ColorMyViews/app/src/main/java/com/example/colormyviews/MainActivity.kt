package com.example.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews =
            listOf(box_one_text, box_two_text, box_three_text,
                box_four_text, box_five_text, constraint_layout,
                red_button, yellow_button, green_button)
        clickableViews.forEach { it.setOnClickListener(::paintColor) }
    }

    private fun paintColor(view: View): Unit {
        when (view.id) {
            // Buttons
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.button_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.button_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.button_green)

            // Color class resources
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Android color resources
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_orange_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

}



