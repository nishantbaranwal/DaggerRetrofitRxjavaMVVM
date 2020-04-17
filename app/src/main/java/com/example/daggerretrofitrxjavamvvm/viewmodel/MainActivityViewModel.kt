package com.example.daggerretrofitrxjavamvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.daggerretrofitrxjavamvvm.model.Result
import com.example.daggerretrofitrxjavamvvm.repo.AppDataManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainActivityViewModel(private val dataManager: AppDataManager) :ViewModel(){

    private val resultList: MutableLiveData<List<Result>> = MutableLiveData()

    fun getMovieResultList(page: Int):LiveData<List<Result>>{
        val compositeDisposable = CompositeDisposable()
        compositeDisposable.add(dataManager.getMovieList(page).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread()).subscribe{
                resultList.value = it!!.resultList
            })
        return resultList
    }

}