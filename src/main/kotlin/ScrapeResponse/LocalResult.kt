package ScrapeResponse


import com.google.gson.annotations.SerializedName

data class LocalResult(
    @SerializedName("address")
    val address: String,
    @SerializedName("coordinates")
    val coordinates: CoordinatesX,
    @SerializedName("position")
    val position: Int,
    @SerializedName("price")
    val price: Price,
    @SerializedName("rating")
    val rating: Int,
    @SerializedName("reviews")
    val reviews: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String
)