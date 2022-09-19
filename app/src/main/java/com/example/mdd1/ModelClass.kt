package com.example.mdd1

import android.content.Context
import android.content.Intent
import android.util.Log

class ModelClass{

    companion object{
        private lateinit var IdArray: IntArray
        private var Indext: Int = 0
        private var count: Boolean = false
        private lateinit var intent: Intent
        private lateinit var context: Context

        fun setIntent(intent: Intent){
            this.intent=intent
        }

        fun setContect(context: Context){
            this.context=context
        }

        fun getIntent():Intent{
            return intent
        }

        fun getIndex():Int{
            return Indext
        }

        fun setIndext(int:Int){
            Indext=int
        }

        fun getArr(): IntArray {
            return IdArray
        }

        fun setCount(){
            count = true
        }

        fun getCount():Boolean{
            return count
        }

        fun setResIds(context: Context){

            var resArrID = IntArray(26)

            for (i in 1..26){
                if (i < 10) {
                    var draw: String = "slide0"+i

                    var id:Int = context.resources.getIdentifier(draw, "drawable", context.packageName)
                    if (i==1){
                        Log.e("Sheldon", id.toString())}
                    resArrID[i-1] = id
                }
                else if (i >= 10){
                    var draw: String = "slide"+i
                    var id:Int = context.resources.getIdentifier(draw, "drawable", context.packageName)
                    resArrID[i-1] = id
                }

            }
            IdArray = resArrID
        }
    }

}
