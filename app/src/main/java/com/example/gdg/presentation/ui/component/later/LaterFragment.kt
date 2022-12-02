package com.example.gdg.presentation.ui.component.later

import android.view.View
import androidx.navigation.findNavController
import com.example.gdg.R
import com.example.gdg.databinding.FragmentLaterBinding
import com.example.gdg.ui.base.BaseFragment

class LaterFragment: BaseFragment<FragmentLaterBinding> (R.layout.fragment_later) {
    override fun init() {
        binding.laterFragment = this
    }

    fun click(view: View) {
        when (view.id) {
            R.id.backBtn -> requireActivity().findNavController(R.id.mainContainer).popBackStack()
        }
    }
}