package jp.mediaxis.fooprototype

import android.app.Application
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.KodeinAware
import com.github.salomonbrys.kodein.lazy
import com.orhanobut.logger.Logger
import jp.mediaxis.fooprototype.di.repositoryModule
import jp.mediaxis.fooprototype.di.viewModelModule

class FooPrototypeApplication: Application(), KodeinAware {

    override val kodein by Kodein.lazy {
        import(repositoryModule)
        import(viewModelModule)
    }

    override fun onCreate() {
        super.onCreate()

        Logger.addLogAdapter(FooPrototypeLogger())
    }
}

