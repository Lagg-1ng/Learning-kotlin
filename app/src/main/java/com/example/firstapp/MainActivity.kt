package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var tsteBool : Boolean = true
    var testChar : Char = '/'//хранит только 1 символ
    var testString : Boolean = "Много текста".startsWith("ываываыв")//храним любой текст
    //startsWich проверяем на первое слово и указываем его
    //для избежания ошибки можно убрать : String, т.к проверкка возвращает Boolean
    //ожем так же поменять : String на : Boolean т.к соответствующий тип данных
    var testString2 : Boolean = "Много текста".endsWith("ываываыв")
    //ndsWith проверка на такой же слово на конце
    var testString3 = "Много текста".length // узнаем размер сообщения
    var testString4 : Boolean = "Много текста".startsWith("ываываыв")
    //равно ли слово в скобках на то что идет первым


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messedj  = findViewById<TextView>(R.id.Messedj)
        messedj.text = "поменяли текст"

    }
//    fun onClickTset2(view : View){
//        val textureView = findViewById<TextView>(R.id.Messedj)
//        textureView.text = "privet"
//    }
}