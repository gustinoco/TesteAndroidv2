package br.com.bankapp.bankapp.view.login.presentation

import br.com.bankapp.bankapp.core.presentation.RxPresenter
import br.com.bankapp.bankapp.util.rx.SchedulerProvider
import br.com.bankapp.bankapp.view.login.domain.LoginRepository


class LoginPresenter(private val schedulerProvider: SchedulerProvider, private val repository: LoginRepository) :
    RxPresenter<LoginContract.View>(), LoginContract.Presenter {

    private var username: String = ""
    private var password: String = ""

    override fun login() {
        launch {
            repository.postLogin(username, password)?.subscribeOn(schedulerProvider.io())
                ?.observeOn(schedulerProvider.ui())?.subscribe({ result ->
                    view?.advanceCurrency(result)
                    view?.showLoading(false)
                }, { error ->
                    view?.showLoading(false)
                })!!
        }
    }

    override var view: LoginContract.View? = null

    override fun start() {
    }

    override fun updateUsername(username: String) {
        this.username = username
    }

    override fun updatePassowrd(password: String) {
        this.password = password
    }



}