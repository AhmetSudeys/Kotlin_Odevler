package com.ahmetsudeys.todoapp.ui.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ahmetsudeys.todoapp.databinding.ActivityMainBinding
import com.ahmetsudeys.todoapp.ui.viewmodel.MainViewModel
import com.ahmetsudeys.todoapp.ui.adapter.ToDoAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    private lateinit var adapter: ToDoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabAdd.setOnClickListener {
            startActivity(Intent(this, AddToDoActivity::class.java))
        }

        // RecyclerView + Adapter kurulumu
        adapter = ToDoAdapter()
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        // Liste gözlemi
        viewModel.todoList.observe(this) { list ->
            adapter.updateList(list)
        }

        // Arama özelliği
        binding.searchView.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                query?.let {
                    viewModel.searchTodos(it).observe(this@MainActivity) { filteredList ->
                        adapter.updateList(filteredList)
                    }
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }
        })
    }
}
