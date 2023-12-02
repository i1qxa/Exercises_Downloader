package com.dietcuisineapp.exercisesdownloader

import kotlinx.serialization.Serializable

@Serializable
data class ExerciseItem(
    val bodyPart:String,
    val equipment:String,
    val gifUrl:String,
    val id:String,
    val name:String,
    val target:String,
    val secondaryMuscles:List<String>,
    val instructions:List<String>,

)
