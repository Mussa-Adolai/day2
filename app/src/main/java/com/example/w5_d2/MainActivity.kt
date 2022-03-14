package com.example.w5_d2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import java.lang.NullPointerException

val x:Int? = null
var constraintLayout : ConstraintLayout? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        constraintLayout = findViewById(R.id.root)


        try{
            val arr:ArrayList<String> = ArrayList()
            arr.add("mussa")
            arr.add("ahmad")
            arr.add("ali")

            // arr[2]= "fahad"
           val person = arr[3]
        }catch(e:IndexOutOfBoundsException){

           //
        // Toast.makeText(this,"IndexOutOfBoundsException",Toast.LENGTH_SHORT).show()
            Snackbar.make(constraintLayout!!,"IndexOutOfBoundsException",Snackbar.LENGTH_SHORT)
                .setAction("ok"){}.show()            // why ? error

        }

        try {
            val v :Int = x!! + 6             // why ? error?
        }catch (e:NullPointerException){
            Toast.makeText(this,"NullPointerException",Toast.LENGTH_SHORT).show()
        }



    }

    fun txtClick(view: View) {

        Toast.makeText(this,"txt toast",Toast.LENGTH_SHORT).show()
        //Toast.makeText(applicationContext,R.r)
    }

    fun btnClick(view: View) {
        Toast.makeText(this,"btn toast",Toast.LENGTH_SHORT).show()
    }


}