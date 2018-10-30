package br.com.bankapp.bankapp.view.login.di

import br.com.bankapp.bankapp.view.login.domain.LoginRepository
import br.com.bankapp.bankapp.view.login.presentation.LoginContract
import br.com.bankapp.bankapp.view.login.presentation.LoginPresenter
import org.koin.dsl.module.module

val loginModule = module {

    single<LoginRepository> { ContactRepositoryImpl(get()) }


    factory<LoginContract.Presenter> { LoginPresenter(get(), get()) }
}