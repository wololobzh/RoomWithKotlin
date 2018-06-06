package fr.acos.roomwithkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.arch.persistence.room.Room
import android.os.AsyncTask
import android.util.Log
import fr.acos.dao.MaBaseDeDonnees
import fr.acos.entities.Personne


class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*AsyncTask.execute({
            val db = Room.databaseBuilder(applicationContext,
                    MaBaseDeDonnees::class.java, "database-name").build()

            val dao = db.personneDao()

            val p1 = Personne(0,"Hassoun","Kiril")
            val p2 = Personne(0,"GuenGuen","Maxime")

            dao.insertAll(p1,p2)
        })*/

        /*AsyncTask.execute({
            val db = Room.databaseBuilder(applicationContext,
                    MaBaseDeDonnees::class.java, "database-name").build()

            val dao = db.personneDao()
            val liste = dao.get()

            liste.forEach { item -> Log.i("XXX",item.toString())}
        })*/


        /*AsyncTask.execute({
            val db = Room.databaseBuilder(applicationContext,
                    MaBaseDeDonnees::class.java, "database-name").build()

            val dao = db.personneDao()

            val pX = Personne(1,"Kikiriri","Kirille")

            dao.updatePersonne(pX)
        })*/

        /*AsyncTask.execute({
            val db = Room.databaseBuilder(applicationContext,
                    MaBaseDeDonnees::class.java, "database-name").build()

            val dao = db.personneDao()

            val pX = Personne(1,"Kikiriri","Kirille")

            dao.deletePersonne(pX)
        })*/

        /*AsyncTask.execute({
            val db = Room.databaseBuilder(applicationContext,
                    MaBaseDeDonnees::class.java, "database-name").build()

            val dao = db.personneDao()

            val pX = Personne(1,"Kikiriri","Kirille")

            val recuperation = dao.get(2L)

            Log.i("XXX",recuperation.toString())
        })*/

    }




}
