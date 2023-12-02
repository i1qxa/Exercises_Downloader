package com.dietcuisineapp.exercisesdownloader

import com.dietcuisineapp.exercisesdownloader.data.ExerciseItemDB
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
){
    fun toDBItem() = ExerciseItemDB(
        id = 0,
        bodyPart = bodyPart,
        equipment = equipment,
        gifUrl = gifUrl,
        remoteId = id,
        name = name,
        target = target,
        secondaryMuscles = secondaryMuscles.toString(),
        instructions = instructions.toString()
    )
}
