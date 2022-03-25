package io.github.tuguzd.viewmodel_livedata_practice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RandomNumberViewModel private constructor(): ViewModel() {
    companion object : SingletonHolder<RandomNumberViewModel>() {
        override val constructor = { RandomNumberViewModel() }
    }

    private val _currentNumber by lazy { MutableLiveData<UInt>() }
    val currentNumber: LiveData<UInt> get() = _currentNumber

    private val range by lazy { 0u until 50u }

    fun generate() {
        _currentNumber.value = range.random()
    }
}
