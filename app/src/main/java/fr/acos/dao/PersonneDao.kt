package fr.acos.dao

import android.arch.persistence.room.*
import fr.acos.entities.Personne

@Dao
interface PersonneDao {

    @Query("SELECT * FROM personnes")
    fun get(): List<Personne>

    @Query("SELECT * FROM personnes WHERE id = :id")
    fun get(id: Long): Personne

    @Insert
    fun insertAll(vararg listCategories: Personne)

    @Update
    fun updatePersonne(task: Personne)

    @Delete
    fun deletePersonne(task: Personne)
}