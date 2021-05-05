package ru.androidlearning.kotlinhw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import ru.androidlearning.kotlinhw1.R
import ru.androidlearning.kotlinhw1.R.string.textViewNewText

class MainActivity : AppCompatActivity() {

    private var dataClassTest: DataClassTest = DataClassTest()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //-------------------------------------------------------------------------
        //Добавить кнопку в разметку и повесить на неё clickListener в Activity:
        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)

        findViewById<Button>(R.id.button1).setOnClickListener {
            textView.text = resources.getString(textViewNewText)
        }

        //-------------------------------------------------------------------------
        //Создайте data class с двумя свойствами, выведите их на экран приложения:
        //(data class объявлен в качестве свойства этого активити)
        findViewById<Button>(R.id.readVal1Button).setOnClickListener {
            dataClassTest.str1 = editText.text.toString()
        }

        findViewById<Button>(R.id.showVal1Button).setOnClickListener {
            textView.text = dataClassTest.str1
        }

        findViewById<Button>(R.id.readVal2Button).setOnClickListener {
            dataClassTest.str2 = editText.text.toString()
        }

        findViewById<Button>(R.id.showVal2Button).setOnClickListener {
            textView.text = dataClassTest.str2
        }

        //создайте Object, в Object вызывайте copy и выводите значения скопированного класса на экран;
        findViewById<Button>(R.id.copyDataToObject).setOnClickListener {
            ObjectText.copyFromDataClassTest(dataClassTest)
        }

        findViewById<Button>(R.id.showVal1FromObjectButton).setOnClickListener {
            textView.text = ObjectText.getStr1()
        }

        findViewById<Button>(R.id.showVal2FromObjectButton).setOnClickListener {
            textView.text = ObjectText.getStr2()
        }

        //выводите значения из разных циклов в консоль, используя примеры из методических материалов
        findViewById<Button>(R.id.printValuesFromLoops).setOnClickListener(printLoopsResults)

    }

    private val printLoopsResults: View.OnClickListener = View.OnClickListener {
        println("Loop on list: ")
        val strList: List<String> = listOf("str1", "Str2", "str3")
        for (str in strList) println(str)

        println("Digits in a loop : ")
        for(i in 1..10) println("digit: " + i)

        println("Outputting digits in a loop in reverse order, step = 2: ")
        for(i in 10 downTo 1 step 2) println("digit: " + i)

    }
}