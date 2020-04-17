package com.example.daggerretrofitrxjavamvvm.model

import com.google.gson.annotations.SerializedName

data class Result(@SerializedName("popularity")val popularity: Double,
                  @SerializedName("original_title")val title:String)