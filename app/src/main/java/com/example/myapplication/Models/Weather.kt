package com.example.myapplication.Models

import java.io.Serializable


data class Weather (
    val id : Int,
    val main : String,
    val descriptor: String,
    val icon : String
        ):Serializable