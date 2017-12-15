package jp.mediaxis.fooprototype.di

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import jp.mediaxis.fooprototype.Repositories.UserRepository
import jp.mediaxis.fooprototype.Repositories.UserRepositoryInterface

val repositoryModule = Kodein.Module {
    bind<UserRepositoryInterface>() with instance(UserRepository())
}

