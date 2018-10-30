package br.com.bankapp.bankapp.view.login.presentation

import br.com.bankapp.bankapp.core.presentation.BasePresenter
import br.com.bankapp.bankapp.core.presentation.BaseView
import br.com.bankapp.bankapp.view.login.domain.model.LoginResponse

interface LoginContract {

    interface View : BaseView<Presenter> {
        fun advanceCurrency(response: LoginResponse)
    }

    interface Presenter : BasePresenter<View> {
        fun login()
        fun updateUsername(username:String)
        fun updatePassowrd(password:String)
    }

}