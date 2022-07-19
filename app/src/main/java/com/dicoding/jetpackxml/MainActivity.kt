package com.dicoding.jetpackxml

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager

class MainActivity : AppCompatActivity() {

    var expanded = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardView = findViewById<CardView>(R.id.cardView)
        val tvHidden = findViewById<TextView>(R.id.tvHidden)

        cardView.setOnClickListener {
            if (expanded){
                TransitionManager.beginDelayedTransition(cardView, AutoTransition())
                tvHidden.visibility = View.GONE
            } else {
                TransitionManager.beginDelayedTransition(cardView, AutoTransition())
                tvHidden.visibility = View.VISIBLE
            }
            expanded = !expanded
        }
    }
}