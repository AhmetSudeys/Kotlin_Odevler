package com.ahmetsudeys.navigationcomponentodevi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ahmetsudeys.navigationcomponentodevi.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonAnasayfadanA.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.AnasayfadanAyaGecis)
        }

        binding.buttonAnasayfadanX.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.AnasayfadanXeGecis)
        }

        return binding.root
    }
}