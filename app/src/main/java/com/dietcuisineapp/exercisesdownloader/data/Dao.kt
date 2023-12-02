package com.dietcuisineapp.exercisesdownloader.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertListOfExercises(listExercises:List<ExerciseItemDB>)

}