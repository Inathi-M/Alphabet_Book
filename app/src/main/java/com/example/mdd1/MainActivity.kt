package com.example.mdd1

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.io.FileNotFoundException
import java.lang.NullPointerException

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var buttonA: Button
    private lateinit var buttonB: Button
    private lateinit var buttonC: Button
    private lateinit var buttonD: Button
    private lateinit var buttonE: Button
    private lateinit var buttonF: Button
    private lateinit var buttonG: Button
    private lateinit var buttonH: Button
    private lateinit var buttonI: Button
    private lateinit var buttonJ: Button
    private lateinit var buttonK: Button
    private lateinit var buttonL: Button
    private lateinit var buttonM: Button
    private lateinit var buttonN: Button
    private lateinit var buttonO: Button
    private lateinit var buttonP: Button
    private lateinit var buttonQ: Button
    private lateinit var buttonR: Button
    private lateinit var buttonS: Button
    private lateinit var buttonT: Button
    private lateinit var buttonU: Button
    private lateinit var buttonV: Button
    private lateinit var buttonW: Button
    private lateinit var buttonX: Button
    private lateinit var buttonY: Button
    private lateinit var buttonZ: Button

    private lateinit var resIntArray: IntArray

    var presenter = MVP()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCreate()

        resIntArray = loopRes()

        //  switchActivity()
    }

    fun switchActivity(){

        buttonA =  findViewById(R.id.buttonA)

        buttonA.setOnClickListener{
            val intent = Intent(this,LetterActivity::class.java)
            //  intent.putExtra("SHOW_WELCOME", true)
            startActivity(intent)
            //  finish()
        }
    }

    // Function to request permission.
    private fun checkPermission() {
        // if (ContextCompat.checkSelfPermission(this@MainActivity, permission) == PackageManager.PERMISSION_DENIED) {
        if (ContextCompat.checkSelfPermission(
                this@MainActivity,
                Manifest.permission.READ_EXTERNAL_STORAGE
            ) == PackageManager.PERMISSION_DENIED
        ) {
            // Requesting the permission
            ActivityCompat.requestPermissions(
                this@MainActivity,
                arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
                1
            )
        } else {
            Toast.makeText(this@MainActivity, "Permission already granted", Toast.LENGTH_SHORT)
                .show()
        }

    }



    override fun onClick(view: View?)
    {
        presenter.setImageArr(applicationContext)

        when ( view!!.id)
        {
            R.id.button1->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(0)
                startActivity(intent)
                finish()
            }
            R.id.button2->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(1)
                startActivity(intent)
                finish()
            }
            R.id.button3->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(2)
                startActivity(intent)
                finish()
            }
            R.id.button4->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(3)
                startActivity(intent)
                finish()
            }
            R.id.button5->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(4)
                startActivity(intent)
                finish()
            }
            R.id.button6->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(5)
                startActivity(intent)
                finish()
            }
            R.id.button7->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(6)
                startActivity(intent)
                finish()
            }
            R.id.button8->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(7)
                startActivity(intent)
                finish()
            }
            R.id.button9->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(8)
                startActivity(intent)
                finish()
            }
            R.id.button10->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(9)
                startActivity(intent)
                finish()
            }
            R.id.button11->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(10)
                startActivity(intent)
                finish()
            }
            R.id.button12->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(11)
                startActivity(intent)
                finish()
            }
            R.id.button13->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(12)
                startActivity(intent)
                finish()
            }
            R.id.button14->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(13)
                startActivity(intent)
                finish()
            }
            R.id.button15->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(14)
                startActivity(intent)
                finish()
            }
            R.id.button16->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(15)
                startActivity(intent)
                finish()
            }
            R.id.button17->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(16)
                startActivity(intent)
                finish()
            }
            R.id.button18->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(17)
                startActivity(intent)
                finish()
            }
            R.id.button19->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(18)
                startActivity(intent)
                finish()
            }
            R.id.button20->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(19)
                startActivity(intent)
                finish()
            }
            R.id.button21->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(20)
                startActivity(intent)
                finish()
            }
            R.id.button22->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(21)
                startActivity(intent)
                finish()
            }
            R.id.button23->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(22)
                startActivity(intent)
                finish()
            }
            R.id.button24->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(23)
                startActivity(intent)
                finish()
            }
            R.id.button25->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(24)
                startActivity(intent)
                finish()
            }
            R.id.button26->
            {
                val intent = Intent(this@MainActivity,LetterActivity::class.java)
                presenter.setImageIn(25)
                startActivity(intent)
                finish()
            }
        }

    }

    fun loopRes():IntArray{

        var resArrID = IntArray(26)

        for (i in 1..26){
            if (i < 10) {
                var draw: String = "slide0"+i

                var id:Int = resources.getIdentifier(draw, "drawable", packageName)
                if (i==1){Log.e("Sheldon", id.toString())}
                resArrID[i-1] = id
            }
            else if (i >= 10){
                var draw: String = "slide"+i
                var id:Int = resources.getIdentifier(draw, "drawable", packageName)
                resArrID[i-1] = id
            }

        }
        return resArrID
    }

    fun buttonCreate(){

        buttonA =  findViewById(R.id.button1)
        buttonB =  findViewById(R.id.button2)
        buttonC =  findViewById(R.id.button3)
        buttonD =  findViewById(R.id.button4)
        buttonE =  findViewById(R.id.button5)
        buttonF =  findViewById(R.id.button6)
        buttonG =  findViewById(R.id.button7)
        buttonH =  findViewById(R.id.button8)
        buttonI =  findViewById(R.id.button9)
        buttonJ =  findViewById(R.id.button10)
        buttonK =  findViewById(R.id.button11)
        buttonL =  findViewById(R.id.button12)
        buttonM =  findViewById(R.id.button13)
        buttonN =  findViewById(R.id.button14)
        buttonO =  findViewById(R.id.button15)
        buttonP =  findViewById(R.id.button16)
        buttonQ =  findViewById(R.id.button17)
        buttonR =  findViewById(R.id.button18)
        buttonS =  findViewById(R.id.button19)
        buttonT =  findViewById(R.id.button20)
        buttonU =  findViewById(R.id.button21)
        buttonV =  findViewById(R.id.button22)
        buttonW =  findViewById(R.id.button23)
        buttonX =  findViewById(R.id.button24)
        buttonY =  findViewById(R.id.button25)
        buttonZ =  findViewById(R.id.button26)

        buttonA.setOnClickListener(this)
        buttonB.setOnClickListener(this)
        buttonC.setOnClickListener(this)
        buttonD.setOnClickListener(this)
        buttonE.setOnClickListener(this)
        buttonF.setOnClickListener(this)
        buttonG.setOnClickListener(this)
        buttonH.setOnClickListener(this)
        buttonI.setOnClickListener(this)
        buttonJ.setOnClickListener(this)
        buttonK.setOnClickListener(this)
        buttonL.setOnClickListener(this)
        buttonM.setOnClickListener(this)
        buttonN.setOnClickListener(this)
        buttonO.setOnClickListener(this)
        buttonP.setOnClickListener(this)
        buttonQ.setOnClickListener(this)
        buttonR.setOnClickListener(this)
        buttonS.setOnClickListener(this)
        buttonT.setOnClickListener(this)
        buttonU.setOnClickListener(this)
        buttonV.setOnClickListener(this)
        buttonW.setOnClickListener(this)
        buttonX.setOnClickListener(this)
        buttonY.setOnClickListener(this)
        buttonZ.setOnClickListener(this)

    }

}