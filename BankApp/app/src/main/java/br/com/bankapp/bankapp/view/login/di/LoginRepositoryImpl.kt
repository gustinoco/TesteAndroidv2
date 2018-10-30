package br.com.bankapp.bankapp.view.login.di

import br.com.bankapp.bankapp.core.data.BankApi
import br.com.bankapp.bankapp.view.login.domain.LoginRepository
import br.com.bankapp.bankapp.view.login.domain.model.LoginResponse
import io.reactivex.Observable

class ContactRepositoryImpl(private val bankApi: BankApi) : LoginRepository {
    override fun postLogin(username: String, password: String): Observable<LoginResponse> {
        return bankApi.postLogin(username, password)
    }

}