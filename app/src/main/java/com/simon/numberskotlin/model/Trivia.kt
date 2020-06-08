package com.simon.numberskotlin.model

import com.google.gson.annotations.SerializedName

class Trivia (
    @SerializedName("text") var text: String,
    @SerializedName("number") var number: Int,
    @SerializedName("found") var found: Boolean,
    @SerializedName("type") var type: String
)