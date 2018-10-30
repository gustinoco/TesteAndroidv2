package br.com.bankapp.bankapp.core.data

import br.com.bankapp.bankapp.view.login.domain.model.LoginResponse
import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.*

interface BankApi {
    @FormUrlEncoded()
    @POST("login")
    fun postLogin(@Field("user") username:String,@Field("password") password:String): Observable<LoginResponse>

    @GET("statements/{id}")
    fun getStatements(@Path("id") id: Long): Flowable<Response<Any>>

}