package br.com.bankapp.bankapp.core.data

import io.reactivex.Flowable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface BankApi {

    @POST("login")
    fun postLogin(): Flowable<Response<Any>>

    @GET("statements/")
    fun getStatements(): Flowable<Response<Any>>

}