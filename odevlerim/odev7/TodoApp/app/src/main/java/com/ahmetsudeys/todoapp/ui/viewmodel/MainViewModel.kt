package com.ahmetsudeys.todoapp.ui.viewmodel

import androidx.lifecycle.*
import com.ahmetsudeys.todoapp.data.ToDo
import com.ahmetsudeys.todoapp.data.ToDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: ToDoRepository
) : ViewModel() {

    val todoList = repository.getAllTodos()

    fun searchTodos(query: String): LiveData<List<ToDo>> {
        return repository.searchTodo(query)
    }

    fun addTodo(name: String) {
        viewModelScope.launch {
            repository.insertTodo(ToDo(name = name))
        }
    }

    fun updateTodo(todo: ToDo) {
        viewModelScope.launch {
            repository.updateTodo(todo)
        }
    }

    fun deleteTodo(todo: ToDo) {
        viewModelScope.launch {
            repository.deleteTodo(todo)
        }
    }
}
