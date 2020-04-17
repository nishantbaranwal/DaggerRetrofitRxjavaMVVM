package com.example.daggerretrofitrxjavamvvm.model

import com.google.gson.annotations.SerializedName

data class ResultList( @SerializedName("results") val resultList : List<Result>)