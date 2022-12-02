package com.example.gdg.presentation.ui.component.home

import android.view.View
import androidx.navigation.findNavController
import com.example.gdg.R
import com.example.gdg.databinding.FragmentHomeBinding
import com.example.gdg.ui.base.BaseFragment

class HomeFragment: BaseFragment<FragmentHomeBinding> (R.layout.fragment_home) {
    override fun init() {
        binding.homeFragment = this
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.shareBtn -> {}
            R.id.writeLaterBtn -> {
                requireActivity().findNavController(R.id.mainContainer).navigate(R.id.action_homeFragment_to_selectDecoFragment)
            }
        }
    }
}