package jp.mediaxis.fooprototype

import com.orhanobut.logger.AndroidLogAdapter

class FooPrototypeLogger: AndroidLogAdapter() {
    override fun isLoggable(priority: Int, tag: String?): Boolean {
        return BuildConfig.DEBUG
    }

    override fun log(priority: Int, tag: String?, message: String?) {
        if (BuildConfig.DEBUG) printDebugLog(priority, tag, message)
        else printProductionLog(priority, tag, message)
    }

    private fun printDebugLog(priority: Int, tag: String?, message: String?) {
        super.log(priority, tag, message)
    }

    private fun printProductionLog(priority: Int, tag: String?, message: String?) {
        // TODO: Print log for production.
    }
}
