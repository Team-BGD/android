package com.example.gdg.presentation.ui.component.later

import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.gdg.R
import com.example.gdg.databinding.FragmentSelectDecoBinding
import com.example.gdg.presentation.viewmodel.LaterViewModel
import com.example.gdg.ui.base.BaseFragment

class SelectDecoFragment: BaseFragment<FragmentSelectDecoBinding>(R.layout.fragment_select_deco) {
    private lateinit var deco: List<View>
    private val laterViewModel by activityViewModels<LaterViewModel>()
    override fun init() {
        binding.selectDecoFragment = this
        initDeco()
    }

    fun click(view: View) {
        when (view.id) {
            R.id.backBtn -> requireActivity().findNavController(R.id.mainContainer).popBackStack()
            R.id.nextBtn -> requireActivity().findNavController(R.id.mainContainer).navigate(R.id.action_selectDecoFragment_to_laterFragment)
            else -> {
                deco.forEachIndexed { index, v ->
                    if (v == view) {
                        laterViewModel.setDeco(index)
                        v.isSelected = true
                    } else {
                        v.isSelected = false
                    }
                }
            }
        }
    }

    private fun initDeco() {
        deco = listOf(
            binding.cookieHolder,
            binding.santaHolder,
            binding.deerHolder,
            binding.redBellHolder,
            binding.goldBellHolder,
            binding.sockHolder,
            binding.blueBellHolder,
            binding.solHolder,
            binding.stickHolder
        )
        if (laterViewModel.currentDeco.value != null) {
            deco[laterViewModel.currentDeco.value!!].isSelected = true
        }
    }
}