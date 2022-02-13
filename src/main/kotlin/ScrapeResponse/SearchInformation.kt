package ScrapeResponse


import com.google.gson.annotations.SerializedName

data class SearchInformation(
    @SerializedName("detected_location")
    val detectedLocation: DetectedLocation,
    @SerializedName("did_you_mean")
    val didYouMean: DidYouMean,
    @SerializedName("no_results_for_original_query")
    val noResultsForOriginalQuery: Boolean,
    @SerializedName("query_displayed")
    val queryDisplayed: String,
    @SerializedName("showing_results_for")
    val showingResultsFor: ShowingResultsFor,
    @SerializedName("time_taken_displayed")
    val timeTakenDisplayed: Double,
    @SerializedName("total_results")
    val totalResults: Int
)