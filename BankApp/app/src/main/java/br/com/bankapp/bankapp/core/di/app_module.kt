package br.com.bankapp.bankapp.core.di

import br.com.bankapp.bankapp.util.rx.ApplicationSchedulerProvider
import br.com.bankapp.bankapp.util.rx.SchedulerProvider
import org.koin.dsl.module.module

val appModule = module {
    // Rx Schedulers
    single<SchedulerProvider> { ApplicationSchedulerProvider() }
}