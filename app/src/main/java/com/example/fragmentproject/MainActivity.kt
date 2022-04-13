package com.example.fragmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import com.example.fragmentproject.R.layout.activity_main


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        val btnOne = findViewById<Button>(R.id.btn1)
       btnOne.setOnClickListener(
            loadFrag1(Fragment_One())
        )

        val btnTwo = findViewById<Button>(R.id.btn2)
        btnTwo.setOnClickListener(
            loadFrag2(Fragment_Two())
        )
    }
      private fun loadFrag1(frag1 : Fragment_One) :View.OnClickListener?{
        val ft : FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag1)
        ft.commit()
    }
    private fun loadFrag2(frag2 : Fragment_Two):View.OnClickListener?{
        val ft : FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag2)
        ft.commit()
    }
}


