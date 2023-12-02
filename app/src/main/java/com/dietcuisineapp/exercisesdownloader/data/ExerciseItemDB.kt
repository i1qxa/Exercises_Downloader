package com.dietcuisineapp.exercisesdownloader.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExerciseItemDB(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val bodyPart:String,
    val equipment:String,
    val gifUrl:String,
    val remoteId:String,
    val name:String,
    val target:String,
    val secondaryMuscles:String,
    val instructions:String,
)
