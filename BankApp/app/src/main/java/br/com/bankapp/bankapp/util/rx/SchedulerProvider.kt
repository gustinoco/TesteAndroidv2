package br.com.bankapp.bankapp.util.rx

import io.reactivex.Scheduler

/**
 * Rx Scheduler Provider
 */
interface SchedulerProvider {
    fun io(): Scheduler
    fun ui(): Scheduler

}