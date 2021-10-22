package com.example.calci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt: TextView = findViewById(R.id.text_result)
        val bt0: Button = findViewById(R.id.btn0)
        val bt1: Button = findViewById(R.id.btn1)
        val bt2: Button = findViewById(R.id.btn2)
        val bt3: Button = findViewById(R.id.btn3)
        val bt4: Button = findViewById(R.id.btn4)
        val bt5: Button = findViewById(R.id.btn5)
        val bt6: Button = findViewById(R.id.btn6)
        val bt7: Button = findViewById(R.id.btn7)
        val bt8: Button = findViewById(R.id.btn8)
        val bt9: Button = findViewById(R.id.btn9)
        val btad: Button = findViewById(R.id.btnadd)
        val btsu: Button = findViewById(R.id.btnsub)
        val btmu: Button = findViewById(R.id.btnmul)
        val btdi: Button = findViewById(R.id.btndiv)
        val btdo: Button = findViewById(R.id.btnequ)
        val btco: Button = findViewById(R.id.btnAC)
        val btot: Button = findViewById(R.id.btndot)
        var truth = 0
        var a = ""
        var b = ""
        var o = 0
        var v = 0.0
        var temp = 0
        var display=" "
        bt0.setOnClickListener {
            if (truth == 0) {
                a = a + "0"
                txt.setText(a)
            } else {
                b = b + "0"
                txt.setText(b)
            }
        }
        bt1.setOnClickListener {
            if (truth == 0) {
                a = a + "1"
                txt.setText(a)
            } else {
                b = b + "1"
                txt.setText(b)
            }
        }
        bt2.setOnClickListener {
            if (truth == 0) {
                a = a + "2"
                txt.setText(a)
            } else {
                b = b + "2"
                txt.setText(b)
            }
        }
        bt3.setOnClickListener {
            if (truth == 0) {
                a = a + "3"
                txt.setText(a)
            } else {
                b = b + "3"
                txt.setText(b)
            }
        }
        bt4.setOnClickListener {
            if (truth == 0) {
                a = a + "4"
                txt.setText(a)
            } else {
                b = b + "4"
                txt.setText(b)
            }
        }
        bt5.setOnClickListener {
            if (truth == 0) {
                a = a + "5"
                txt.setText(a)
            } else {
                b = b + "5"
                txt.setText(b)
            }
        }
        bt6.setOnClickListener {
            if (truth == 0) {
                a = a + "6"
                txt.setText(a)
            } else {
                b = b + "6"
                txt.setText(b)
            }
        }
        bt7.setOnClickListener {
            if (truth == 0) {
                a = a + "7"
                txt.setText(a)
            } else {
                b = b + "7"
                txt.setText(b)
            }
        }
        bt8.setOnClickListener {
            if (truth == 0) {
                a = a + "8"
                txt.setText(a)
            } else {
                b = b + "8"
                txt.setText(b)
            }
        }
        bt9.setOnClickListener {
            if (truth == 0) {
                a = a + "9"
                txt.setText(a)
            } else {
                b = b + "9"
                txt.setText(b)
            }
        }
        btot.setOnClickListener {
            if (truth == 0) {
                a = a + "."
                txt.setText(a)
            } else {
                b = b + "."
                txt.setText(b)
            }
        }
        btco.setOnClickListener {
            a = " "
            b = " "
            truth = 0
            txt.setText(" ")
        }
        btad.setOnClickListener {
            o = 1
            truth = 1
        }
        btsu.setOnClickListener {
            o = 2
            truth = 1
        }
        btmu.setOnClickListener {
            o = 3
            truth = 1
        }
        btdi.setOnClickListener {
            o = 4
            truth = 1
        }
        btdo.setOnClickListener {
            if (o == 1)
                v = a.toDouble() + b.toDouble()
            else if (o == 2)
                v = a.toDouble() - b.toDouble()
            else if (o == 3)
                v = a.toDouble() * b.toDouble()
            else if (o == 4) {
                v = a.toDouble() / b.toDouble()
            }
            temp = v.toInt()
            if (v - temp == 0.0) {
                a = temp.toString()
                txt.setText("$temp")

            } else {
                a = temp.toString()
                txt.setText("$v")
            }
            b = " "
        }







    }
}