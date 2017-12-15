package jp.mediaxis.fooprototype.Views

import android.annotation.SuppressLint
import android.databinding.DataBindingUtil
import android.os.Bundle
import com.github.salomonbrys.kodein.android.KodeinAppCompatActivity
import com.github.salomonbrys.kodein.instance
import jp.mediaxis.fooprototype.R
import jp.mediaxis.fooprototype.databinding.ActivityMainBinding

class MainActivity : KodeinAppCompatActivity() {
    private val viewModel: MainViewModel by injector.instance()

    @SuppressLint("MissingSuperCall")
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
