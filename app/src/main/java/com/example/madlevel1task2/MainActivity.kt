package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnConfirm.setOnClickListener {
            checkAnswers()

        }


    }

      private fun checkAnswers() {
          var points = 0;

        val answer1 = binding.etAnswer1.text.toString()

        if (answer1 == "T" || answer1 == "t") {
            points++;

        }
          val answer2 = binding.etAnswer2.text.toString()

          if (answer2 == "F" || answer2 == "f") {
              points++;
          }

          val answer3 = binding.etAnswer3.text.toString()

          if (answer3 == "F" || answer3 == "f") {
              points++;
          }

          val answer4 = binding.etAnswer4.text.toString()

          if (answer4 == "F" || answer4 == "f") {
              points++;
          }

          Toast.makeText(this, getString(R.string.answer1) + points.toString() + getString(R.string.answer2), Toast.LENGTH_LONG).show()


      }





}

