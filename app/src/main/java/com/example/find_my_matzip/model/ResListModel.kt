package com.example.find_my_matzip.model

data class ResListModel (
    val page:String,
    val perPage:String,
    val total:String,
    val totalPages:String,

    val data:List<RestaurantDto>
)