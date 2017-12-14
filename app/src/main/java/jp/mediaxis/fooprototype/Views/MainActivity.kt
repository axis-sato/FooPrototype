package jp.mediaxis.fooprototype.Views

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import jp.mediaxis.fooprototype.R
import jp.mediaxis.fooprototype.Repositories.UserRepository
import jp.mediaxis.fooprototype.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val viewModel = MainViewModel(UserRepository())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBinding()
    }

    private fun setupBinding() {
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(
                this,
                R.layout.activity_main
        )
        binding.viewModel = viewModel
    }
}
