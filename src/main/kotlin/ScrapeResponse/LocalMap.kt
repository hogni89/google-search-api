package ScrapeResponse


import com.google.gson.annotations.SerializedName

data class LocalMap(
    @SerializedName("coordinates")
    val coordinates: Coordinates,
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("url")
    val url: String
)