package com.example.myweatherwhizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private var Nothing?.text: Unit
    get() {
        TODO("Not yet implemented")
    }
    set(value) {}

class MainActivity3 : AppCompatActivity() {
    //Sample data
    private val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    private val maxTemperatures = arrayOf(25, 29, 20, 24, 26, 18, 16)
    private val minTemperatures = arrayOf(12, 15, 13, 16, 20, 10, 10)
    private val weatherConditions = arrayOf("Sunny", "Sunny", "Partly Cloudy", "Sunny", "Sunny", "Rainy", "Cold" )
    val exit = findViewById<Button>(R.id.button4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val btnMainActivity = findViewById<Button>(R.id.button4)
        btnMainActivity.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)


            val averageTemperatureTextView: TextView = findViewById(R.id.averageTemperatureTextView)
            val detailedWeatherTextView: TextView = findViewById(R.id.detailedWeatherTextView)

            //calculate average temperature
            var totalTemperature = 0
            for (i in maxTemperatures.indices)
                totalTemperature += (maxTemperatures[i] + minTemperatures[i])/2
    }
        val totalTemperature = null
        val averageTemperature = totalTemperature / daysOfWeek.size

        val averageTemperatureTextView = null
        "Average Temperature: $averageTemperature ºC".also { averageTemperatureTextView.text }

        //display detailed weather information
        val stringBuilder = StringBuilder()
        for (i in daysOfWeek.indices) {
            stringBuilder.append("${daysOfWeek[i]}:\n")
            stringBuilder.append("Max Temperature: ${maxTemperatures[i]}ºC\n")
            stringBuilder.append("Min Temperature: ${minTemperatures[i]}ºC\n")
            stringBuilder.append("Weather Condition: ${weatherConditions[i]}\n\n")
        }
        val detailedWeatherTextview = null
        detailedWeatherTextview.text
    }
}

private operator fun Nothing?.div(size: Int) {

}
