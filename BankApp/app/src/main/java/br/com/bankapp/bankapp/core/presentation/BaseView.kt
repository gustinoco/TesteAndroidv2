package br.com.bankapp.bankapp.core.presentation

interface BaseView<out T : BasePresenter<*>> {
    val presenter: T
    fun showMessage(message: String)
    fun showLoading(active: Boolean)
}