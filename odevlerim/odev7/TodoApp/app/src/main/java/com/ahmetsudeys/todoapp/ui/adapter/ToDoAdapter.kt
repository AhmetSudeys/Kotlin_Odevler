package com.ahmetsudeys.todoapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ahmetsudeys.todoapp.databinding.ItemTodoBinding
import com.example.todoapp.data.ToDo

class ToDoAdapter(
    private val todoList: List<ToDo>
) : RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>() {

    inner class ToDoViewHolder(val binding: ItemTodoBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val binding = ItemTodoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ToDoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        val item = todoList[position]
        holder.binding.textViewName.text = item.name
    }

    override fun getItemCount(): Int = todoList.size
}
