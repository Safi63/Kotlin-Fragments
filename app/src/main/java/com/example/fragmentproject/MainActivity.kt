package com.example.fragmentproject

import Custom_Dialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction
import com.example.fragmentproject.R.layout.activity_main


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        val rateText = findViewById<TextView>(R.id.rateMeTextView)
        rateText.setOnClickListener{
           loadDialog(Custom_Dialog())
        }

        val btnTwo = findViewById<Button>(R.id.btn2)
        btnTwo.setOnClickListener{loadFrag2(Fragment_Two())}



        val btnOne = findViewById<Button>(R.id.btn1)
        btnOne.setOnClickListener{loadFrag1(Fragment_One())}
    }

    fun loadDialog(dialog : Custom_Dialog) : View.OnClickListener? {
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment, dialog)
        ft.commit()
        return null
    }
      fun loadFrag1(frag1 : Fragment_One) : View.OnClickListener? {
        val ft : FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag1)
        ft.commit()
          return null
    }
     fun loadFrag2(frag2 : Fragment_Two):View.OnClickListener?{
        val ft : FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag2)
        ft.commit()
        return null
    }
}


