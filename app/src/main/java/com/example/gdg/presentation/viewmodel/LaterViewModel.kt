package com.example.gdg.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gdg.presentation.util.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LaterViewModel @Inject constructor(

): ViewModel() {
    private val _currentDeco = SingleLiveEvent<Int>()
    val currentDeco: MutableLiveData<Int> get() = _currentDeco

    fun setDeco(deco: Int) {
        _currentDeco.value = deco
    }
}