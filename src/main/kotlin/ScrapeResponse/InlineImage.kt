package ScrapeResponse


import com.google.gson.annotations.SerializedName

data class InlineImage(
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("title")
    val title: String
)