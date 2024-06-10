package com.example.myweatherwhizapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private val averageTemperatureºC: String = ""

    private val weeklyWeather = arrayOf(12-25, 15-29, 13-20, 16-24, 20-26, 10-18, 10-16)//Weekly temperatures in Celsius

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Clear = findViewById<Button>(R.id.button3)

        val btnMainActivity3 = findViewById<Button>(R.id.button2)
        btnMainActivity3.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

            val averageTemperatureTextView = findViewById<TextView>(R.id.textView5)
            val averageTemperature = calculateAverageTemperature()
            averageTemperatureTextView.text = "Average Temperature: $averageTemperatureºC"
        }
    }

    private fun calculateAverageTemperature(): Int {
        var sum = 0
        for (temperature in weeklyWeather) {
            sum += temperature

        }
        return sum / weeklyWeather.size
    }
}