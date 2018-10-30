package br.com.bankapp.bankapp.view.login.domain.model

import com.google.gson.annotations.SerializedName

class LoginResponse(@SerializedName("userAccount") val userAccount: UserAccount?,
            @SerializedName("error") var error: Error?)