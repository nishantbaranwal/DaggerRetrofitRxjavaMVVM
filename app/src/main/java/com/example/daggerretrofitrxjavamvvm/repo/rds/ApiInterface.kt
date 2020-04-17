package com.example.daggerretrofitrxjavamvvm.repo.rds

import com.example.daggerretrofitrxjavamvvm.model.ResultList
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("discover/movie?sort_by=popularity.desc&api_key=bfe85bf7d7aac066e48cfa121ec821cc")
    fun getResultList(@Query("page") page: Int): Observable<ResultList>

}