package jp.mediaxis.fooprototype

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.orhanobut.logger.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Logger.d("debug")
        Logger.w("warning")
        Logger.e("error")
    }
}
