package jp.mediaxis.fooprototype.di

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.provider
import jp.mediaxis.fooprototype.Views.MainViewModel

val viewModelModule = Kodein.Module {
    bind<MainViewModel>() with provider {
        MainViewModel(instance())
    }
}
