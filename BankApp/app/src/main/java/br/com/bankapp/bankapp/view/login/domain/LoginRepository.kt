package br.com.bankapp.bankapp.view.login.domain

import br.com.bankapp.bankapp.view.login.domain.model.LoginResponse
import io.reactivex.Observable
import retrofit2.Response

interface LoginRepository {
    fun postLogin(username: String, password: String): Observable<LoginResponse>
}