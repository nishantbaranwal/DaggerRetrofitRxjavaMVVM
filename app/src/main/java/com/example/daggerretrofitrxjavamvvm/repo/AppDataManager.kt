package com.example.daggerretrofitrxjavamvvm.repo

import com.example.daggerretrofitrxjavamvvm.model.ResultList
import com.example.daggerretrofitrxjavamvvm.repo.rds.AppApiHelper
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDataManager @Inject constructor(
    private val apiHelper: AppApiHelper
){
    fun getMovieList(page:Int):Observable<ResultList>{
        return apiHelper.getMovieList(page)
    }
}