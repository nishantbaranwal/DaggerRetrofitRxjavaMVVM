package com.example.daggerretrofitrxjavamvvm.repo.rds

import com.example.daggerretrofitrxjavamvvm.model.ResultList
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppApiHelper @Inject constructor(private val apiInterface: ApiInterface):ApiHelper {
    override fun getMovieList(page:Int): Observable<ResultList> {
        return apiInterface.getResultList(page).subscribeOn(Schedulers.io()).map { it }
    }
}