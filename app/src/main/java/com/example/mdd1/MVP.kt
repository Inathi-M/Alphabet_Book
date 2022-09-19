package com.example.mdd1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.util.Log
import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity


class MVP {

    fun setImageLetter(imageView:ImageView, context:Context){

        var bm = BitmapFactory.decodeResource(context.resources, ModelClass.getArr()?.get(ModelClass.getIndex()) ?:0 )
        imageView.setImageBitmap(bm)
    }

    fun setImageIn(int:Int){
        ModelClass.setIndext(int)
    }

    fun setImageIntLetter(int:Int){
        ModelClass.setIndext(int)
    }

    fun setImageArr(context: Context){
        if (!ModelClass.getCount()){
            ModelClass.setCount()
            ModelClass.setResIds(context)}
    }


}