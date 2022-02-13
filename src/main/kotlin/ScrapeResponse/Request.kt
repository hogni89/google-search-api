package ScrapeResponse


import com.google.gson.annotations.SerializedName

data class Request(
    @SerializedName("processed_timestamp")
    val processedTimestamp: Int,
    @SerializedName("search_url")
    val searchUrl: String,
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("total_time_taken")
    val totalTimeTaken: Double
)