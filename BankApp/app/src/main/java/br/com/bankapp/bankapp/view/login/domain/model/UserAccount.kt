package br.com.bankapp.bankapp.view.login.domain.model

import com.google.gson.annotations.SerializedName

class UserAccount(@SerializedName("userId") val userId: Int?,
                  @SerializedName("name") var name: String?,
                  @SerializedName("agency") var agency: String?,
                  @SerializedName("balance") var balance: Double?,
                  @SerializedName("bankAccount") val bankAccount: String?)