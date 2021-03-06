package com.hypertrack.android.response

data class SingleDriverResponse(
    val _id: String,
    val driver_id: String,
    val name: String,
    val device_id: String,
    val token: String,
    val createdAt: String,
    val updatedAt: String,
    val __v: String,
    val active_trip: String,
    val app_name: String,
    val platform: String,
   val deliveries : ArrayList<Deliveries>
)

data class Deliveries(val status : String,val _id : String,
                      val delivery_id : String,val driver_id : String,
                      val label : String,val customerNote : String,
                      val createdAt : String,val updatedAt : String,
                      val items : ArrayList<Items>, val address : Address,
                      val deliveryNote : String,var deliveryPicture : String,var enteredAt :String,
                      val completedAt : String,val exitedAt : String)
// showNavigationItem =  this object only for sho navigation icon in pending category deliveries

data class Items(val _id : String,val item_id :String,val item_label : String,val item_sku : String)

data class Address (val street : String,val postalCode : String,val city : String,val country : String)

