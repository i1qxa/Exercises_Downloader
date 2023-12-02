package com.dietcuisineapp.exercisesdownloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.dietcuisineapp.exercisesdownloader.databinding.ActivityMainBinding
import kotlinx.serialization.json.Json
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

const val API_KEY = "1a29ccc9c9mshed9e4da7e217435p1efa8ajsned0632a69413"
const val API_HOST = "exercisedb.p.rapidapi.com"
const val MY_LOG_TAG = "my log tag"

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnRequestExercises.setOnClickListener {
            getListExercises()
        }
    }



    private fun getListExercises(){
        val bodyPart = binding.etBodyPart.text
        val url = "https://exercisedb.p.rapidapi.com/exercises/bodyPart/$bodyPart?limit=50"
        val client = OkHttpClient()
        val request = Request.Builder()
            .url(url)
            .get()
            .addHeader("X-RapidAPI-Key", API_KEY)
            .addHeader("X-RapidAPI-Host", API_HOST)
            .build()

        client.newCall(request).enqueue(object :Callback{
            override fun onFailure(call: Call, e: IOException) {
                Log.d(MY_LOG_TAG, e.message.toString())
            }

            override fun onResponse(call: Call, response: Response) {
                if (!response.isSuccessful){
                    Log.d(MY_LOG_TAG, response.code.toString())
                }else{

                }
            }
        })
    }

//    private fun convertJsonToExercise(inputJson:Json):List<ExerciseItem>{
//        return
//    }

}