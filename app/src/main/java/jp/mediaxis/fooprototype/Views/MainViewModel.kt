package jp.mediaxis.fooprototype.Views

import android.databinding.BaseObservable
import android.view.View
import com.orhanobut.logger.Logger
import jp.mediaxis.fooprototype.Entities.User

class MainViewModel(private val user: User): BaseObservable() {

    var userName: String = ""
        get() = user.name

    var userAge: String = ""
        get() = Integer.toString(user.age)


    fun onClickButton(view: View) {
        Logger.d("on click")
    }
}
