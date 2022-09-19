package com.example.mdd1

import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.io.File
import kotlin.properties.Delegates

class LetterActivity : AppCompatActivity(), View.OnClickListener{
    private lateinit var buttonA: Button
    private lateinit var buttonZ: Button
    private lateinit var buttonOver: Button
    private lateinit var buttonNext: Button
    private lateinit var buttonPrevious: Button

    private lateinit var resArr1: IntArray
    private var resInt1 :Int = 0

    private lateinit var imageView:ImageView

    var presenter = MVP()

    override fun onClick(view: View?) {
        when (view!!.id) {

            R.id.buttonA -> {
                //resInt1=0
                presenter.setImageIn(0)
                presenter.setImageLetter(imageView, applicationContext)

            }
            R.id.buttonZ -> {
                presenter.setImageIn(25)
                presenter.setImageLetter(imageView, applicationContext)
            }
            R.id.buttonOver -> {
                val intent = Intent(this@LetterActivity,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            R.id.buttonNext -> {

                if (ModelClass.getIndex()!=25){
                    presenter.setImageIn(ModelClass.getIndex()+1)
                    presenter.setImageLetter(imageView, applicationContext)
                }
                else{
                    presenter.setImageIn(0)
                    presenter.setImageLetter(imageView, applicationContext)
                }
            }
            R.id.buttonPrevious -> {
                if (ModelClass.getIndex()!=0){
                    presenter.setImageIn(ModelClass.getIndex()-1)
                    presenter.setImageLetter(imageView, applicationContext)
                }
                else{
                    presenter.setImageIn(25)
                    presenter.setImageLetter(imageView, applicationContext)
                }
            }
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letter)

        imageView = findViewById(R.id.slideA)

        createButton()

        var bm = BitmapFactory.decodeResource(resources, ModelClass.getArr().get(ModelClass.getIndex()) ?:0 )
        imageView.setImageBitmap(bm)

    }

    fun DisplayLetter(imageView: ImageView){

    }

    fun createButton(){
        buttonA =  findViewById(R.id.buttonA)
        buttonZ =  findViewById(R.id.buttonZ)
        buttonOver =  findViewById(R.id.buttonOver)
        buttonNext =  findViewById(R.id.buttonNext)
        buttonPrevious =  findViewById(R.id.buttonPrevious)

        buttonA.setOnClickListener(this)
        buttonZ.setOnClickListener(this)
        buttonOver.setOnClickListener(this)
        buttonNext.setOnClickListener(this)
        buttonPrevious.setOnClickListener(this)
    }
}