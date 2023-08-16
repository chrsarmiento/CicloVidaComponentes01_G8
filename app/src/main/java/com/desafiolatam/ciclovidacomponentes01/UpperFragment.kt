package com.desafiolatam.ciclovidacomponentes01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import com.desafiolatam.ciclovidacomponentes01.databinding.FragmentUpperBinding
import kotlinx.coroutines.flow.collect


class UpperFragment : Fragment() {

    val viewModel : MainViewModel by activityViewModels()

    private lateinit var binding : FragmentUpperBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUpperBinding.inflate(layoutInflater,container,false)

        lifecycleScope.launchWhenCreated {
            viewModel.counterStateFlow.collect {
                binding.tvClick.text = it.toString()
            }
        }

        return binding.root
    }

}