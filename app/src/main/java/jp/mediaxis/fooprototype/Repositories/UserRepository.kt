package jp.mediaxis.fooprototype.Repositories

import jp.mediaxis.fooprototype.Entities.User

interface UserRepositoryInterface {
    fun getUser(): User
}

class UserRepository(): UserRepositoryInterface {
    override fun getUser(): User {
        return User("Sato", 28)
    }
}
