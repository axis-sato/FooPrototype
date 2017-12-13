package jp.mediaxis.fooprototype

import android.app.Application
import com.orhanobut.logger.Logger

class FooPrototypeApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        Logger.addLogAdapter(FooPrototypeLogger())
    }
}

