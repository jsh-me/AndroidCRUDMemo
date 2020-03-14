package com.example.myapp

import com.fasterxml.jackson.annotation.JsonProperty

data class Data (
    @JsonProperty("id") var id: Int,
    @JsonProperty("title") var title:String,
    @JsonProperty("content") var content:String
)