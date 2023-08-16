package com.desafiolatam.ciclovidacomponentes01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.desafiolatam.ciclovidacomponentes01.databinding.FragmentLowerBinding


class LowerFragment : Fragment(){

    val viewModel: MainViewModel by activityViewModels()

    private lateinit var binding: FragmentLowerBinding

    private lateinit var textView: AppCompatTextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLowerBinding.inflate(layoutInflater,container,false)

        textView = binding.tvClick

        //binding.tvClick.setOn....
        textView.setOnClickListener {
            viewModel.increase()
        }

        return binding.root

    }


}