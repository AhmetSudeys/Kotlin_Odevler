package com.example.todoapp.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ToDoDao {

    @Query("SELECT * FROM todos ORDER BY id DESC")
    fun getAllTodos(): LiveData<List<ToDo>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo: ToDo)

    @Update
    suspend fun updateTodo(todo: ToDo)

    @Delete
    suspend fun deleteTodo(todo: ToDo)

    @Query("SELECT * FROM todos WHERE name LIKE '%' || :query || '%' ")
    fun searchTodo(query: String): LiveData<List<ToDo>>
}
