package ScrapeResponse


import com.google.gson.annotations.SerializedName

data class ScrapeResult(
    @SerializedName("inline_images")
    val inlineImages: List<InlineImage>,
    @SerializedName("local_map")
    val localMap: LocalMap,
    @SerializedName("local_results")
    val localResults: List<LocalResult>,
    @SerializedName("organic_results")
    val organicResults: List<OrganicResult>,
    @SerializedName("request")
    val request: Request,
    @SerializedName("search_information")
    val searchInformation: SearchInformation,
    @SerializedName("search_parameters")
    val searchParameters: SearchParameters
)