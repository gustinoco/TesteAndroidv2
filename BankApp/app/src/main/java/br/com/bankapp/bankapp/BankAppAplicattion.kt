package br.com.bankapp.bankapp

import android.app.Application
import br.com.bankapp.bankapp.core.di.appModule
import br.com.bankapp.bankapp.core.di.remoteDatasourceModule
import org.koin.android.ext.android.startKoin

/**
 * @author gustinoco
 */
class BankAppAplicattion : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        startKoin(this, listOf(appModule, remoteDatasourceModule))
        //Fabric.with(this, Crashlytics())
    }

    companion object {
        var instance: BankAppAplicattion? = null
            private set
    }
}