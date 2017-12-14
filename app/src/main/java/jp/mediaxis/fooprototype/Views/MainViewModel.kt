package jp.mediaxis.fooprototype.Views

import android.view.View
import com.orhanobut.logger.Logger
import jp.mediaxis.fooprototype.Entities.User
import jp.mediaxis.fooprototype.Repositories.UserRepositoryInterface

class MainViewModel(private val userRepository: UserRepositoryInterface) {
    private val user: User = userRepository.getUser()

    var userName: String = ""
        get() = user.name

    var userAge: String = ""
        get() = Integer.toString(user.age)


    fun onClickButton(view: View) {
        Logger.d("on click")
    }
}
