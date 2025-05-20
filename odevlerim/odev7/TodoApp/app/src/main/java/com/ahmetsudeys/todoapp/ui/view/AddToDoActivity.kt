package com.ahmetsudeys.todoapp.ui.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.ahmetsudeys.todoapp.databinding.ActivityAddToDoBinding
import com.ahmetsudeys.todoapp.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddToDoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddToDoBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddToDoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAdd.setOnClickListener {
            val name = binding.editTextTodoName.text.toString()
            if (name.isNotBlank()) {
                viewModel.addTodo(name)
                Toast.makeText(this, "Eklendi", Toast.LENGTH_SHORT).show()
                finish() // geri dön
            } else {
                Toast.makeText(this, "Boş bırakma", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
