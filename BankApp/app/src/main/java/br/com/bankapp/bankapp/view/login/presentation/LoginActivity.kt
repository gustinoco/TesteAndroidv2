package br.com.bankapp.bankapp.view.login.presentation

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import br.com.bankapp.bankapp.R
import br.com.bankapp.bankapp.core.presentation.BaseActivity
import br.com.bankapp.bankapp.view.login.domain.model.LoginResponse
import kotlinx.android.synthetic.main.login_activity.*
import org.koin.android.ext.android.inject

class LoginActivity : BaseActivity(), LoginContract.View {
    override fun advanceCurrency(response: LoginResponse) {

    }


    override val presenter: LoginContract.Presenter by inject()

    override fun showLoading(active: Boolean) {
        //fazer
    }

    override fun showMessage(message: String) {
      //  view?.showSnack(message)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        initComponents()
    }

    fun initComponents(){
        button.setOnClickListener { presenter.login() }
        textInputEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                presenter.updatePassowrd(p0.toString())
            }
        })

        textInputEditText2.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                presenter.updateUsername(p0.toString())
            }
        })
    }

    override fun onStart() {
        super.onStart()
        presenter.subscribe(this)
        presenter.start()
    }

    override fun onStop() {
        super.onStop()
        presenter.unSubscribe()
    }
}