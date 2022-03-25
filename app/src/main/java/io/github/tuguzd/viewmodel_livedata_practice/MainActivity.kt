package io.github.tuguzd.viewmodel_livedata_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.tuguzd.viewmodel_livedata_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel get() = RandomNumberViewModel.instance

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.currentNumber.observe(this) {
            binding.rndNum.text = it.toString()
        }

        binding.getRnd.setOnClickListener {
            viewModel.generate()
        }
    }
}
