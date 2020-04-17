package com.example.daggerretrofitrxjavamvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.daggerretrofitrxjavamvvm.repo.AppDataManager
import com.example.daggerretrofitrxjavamvvm.viewmodel.MainActivityViewModel
import javax.inject.Inject

@Suppress("UNCHECKED_CAST")
class ViewModelProviderFactory @Inject constructor(private val dataManager: AppDataManager) :ViewModelProvider.NewInstanceFactory(){

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel( dataManager) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: $modelClass.getName()")
    }

}