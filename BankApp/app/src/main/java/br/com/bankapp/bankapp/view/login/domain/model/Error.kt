package br.com.bankapp.bankapp.view.login.domain.model

import com.google.gson.annotations.SerializedName

class Error(@SerializedName("code") val code: Int?,
                  @SerializedName("message") var message: String?)