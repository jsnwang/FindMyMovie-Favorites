package com.example.omdb.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.omdb.response.MediaItem
import kotlinx.coroutines.flow.Flow

@Dao
interface MediaItemDao {

    @Query("SELECT * FROM media_item")
    fun getAll(): Flow<List<MediaItem>>

    @Insert
    suspend fun insertAll(vararg item: MediaItem)

    @Insert
    suspend fun insert(item: MediaItem)

    @Delete
    suspend fun delete(item: MediaItem)
}