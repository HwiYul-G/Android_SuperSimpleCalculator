package com.example.supersimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    // 파일 내의 모든 클래스에서 사용되도록 전역변수로 선언
    lateinit var edit1: EditText
    lateinit var edit2: EditText
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMul: Button
    lateinit var btnDiv: Button
    lateinit var btnRem: Button
    lateinit var textResult: TextView
    lateinit var num1: String
    lateinit var num2: String
    var result: Double? = null


    // main 메소드
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "초간단 계산기"

        edit1 = findViewById<EditText>(R.id.Edit1)
        edit2 = findViewById<EditText>(R.id.Edit2)
        btnAdd = findViewById<Button>(R.id.BtnAdd)
        btnSub = findViewById<Button>(R.id.BtnSub)
        btnMul = findViewById<Button>(R.id.BtnMul)
        btnDiv = findViewById<Button>(R.id.BtnDiv)
        btnRem = findViewById<Button>(R.id.BtnRem)
        textResult = findViewById<TextView>(R.id.TextResult)

        // 터치 시 동작하는 내용을 setOnTouchListener 람다식 안에 코딩한다.
        // 리스너 람다식(listener lambda expression)
        // 버튼, 체크박스, 라디오버튼 등을터치(클릭)하여 어떤 동작이 일어나게 할 때는
        // 해당 위젯에 리스너 람다식을 설정해 처리하도록 해야한다.
        // 예를 들어, setOnTouchListener {} 안에 필요한 내용을 코딩ㅎ느 것이 프로그래머가 할일이다.
        btnAdd.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            try {
                if (num1 == "" || num2 == "")
                    throw Exception("값을 제대로 입력해주세요.")
                result = num1.toDouble() + num2.toDouble()
            } catch (e: Exception) {
                Toast.makeText(applicationContext, e.message, Toast.LENGTH_SHORT).show()
            }
            textResult.text = "계산 결과 : " + result.toString()
        }

        btnSub.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            try {
                if (num1 == "" || num2 == "")
                    throw Exception("값을 제대로 입력해주세요.")
                result = num1.toDouble() - num2.toDouble()
            } catch (e: Exception) {
                Toast.makeText(applicationContext, e.message, Toast.LENGTH_SHORT).show()
            }
            textResult.text = "계산 결과 : " + result.toString()
        }

        btnMul.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            try {
                if (num1 == "" || num2 == "")
                    throw Exception("값을 제대로 입력해주세요.")
                result = num1.toDouble() * num2.toDouble()
            } catch (e: Exception) {
                Toast.makeText(applicationContext, e.message, Toast.LENGTH_SHORT).show()
            }
            textResult.text = "계산 결과 : " + result.toString()
        }

        btnDiv.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            try {
                if (num1 == "" || num2 == "")
                    throw Exception("값을 제대로 입력해주세요.")
                if(num2 == "0")
                    throw Exception("0으로 나눌 수 없습니다.")
                result = num1.toDouble() / num2.toDouble()
            } catch (e: Exception) {
                Toast.makeText(applicationContext, e.message, Toast.LENGTH_SHORT).show()
            }
            textResult.text = "계산 결과 : " + result.toString()
        }

        btnRem.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            try {
                if (num1 == "" || num2 == "")
                    throw Exception("값을 제대로 입력해주세요.")
                if(num2 == "0")
                    throw Exception("0으로 나눌 수 없습니다.")
                result = num1.toDouble() % num2.toDouble()
            } catch (e: Exception) {
                Toast.makeText(applicationContext, e.message, Toast.LENGTH_SHORT).show()
            }
            textResult.text = "계산 결과 : " + result.toString()
        }

    }
}