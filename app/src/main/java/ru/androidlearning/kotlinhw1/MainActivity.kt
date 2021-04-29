package ru.androidlearning.kotlinhw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import ru.androidlearning.kotlinhw1.R
import ru.androidlearning.kotlinhw1.R.string.textViewNewText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Добавить кнопку в разметку и повесить на неё clickListener в Activity.
        val textView = findViewById<TextView>(R.id.textView)
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            textView.text = resources.getString(textViewNewText)
        }

    }
}