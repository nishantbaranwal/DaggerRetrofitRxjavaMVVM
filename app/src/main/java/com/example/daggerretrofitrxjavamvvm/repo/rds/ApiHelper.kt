package com.example.daggerretrofitrxjavamvvm.repo.rds
import com.example.daggerretrofitrxjavamvvm.model.ResultList
import io.reactivex.Observable

interface ApiHelper {
    fun getMovieList(page:Int): Observable<ResultList>
}