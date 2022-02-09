package com.example.omdb.local

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.omdb.local.dao.MediaItemDao
import com.example.omdb.response.MediaItem

@Database(entities = [MediaItem::class], version = 1)
abstract class OmdbDatabase : RoomDatabase() {

    abstract fun mediaItemDao(): MediaItemDao

    companion object {
        private var INSTANCE: OmdbDatabase? = null

        fun getInstance(
            app: Application
        ) = INSTANCE ?: Room.databaseBuilder(
            app, OmdbDatabase::class.java, "omdb-db"
        ).build().also { INSTANCE = it }
    }
}