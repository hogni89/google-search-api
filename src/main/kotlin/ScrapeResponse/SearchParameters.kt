package ScrapeResponse


import com.google.gson.annotations.SerializedName

data class SearchParameters(
    @SerializedName("access_key")
    val accessKey: String,
    @SerializedName("action")
    val action: String,
    @SerializedName("auto_location")
    val autoLocation: String,
    @SerializedName("csv_fields")
    val csvFields: String,
    @SerializedName("device")
    val device: String,
    @SerializedName("engine")
    val engine: String,
    @SerializedName("error")
    val error: Error,
    @SerializedName("exclude_autocorrected_results")
    val excludeAutocorrectedResults: String,
    @SerializedName("gl")
    val gl: String,
    @SerializedName("google_domain")
    val googleDomain: String,
    @SerializedName("hl")
    val hl: String,
    @SerializedName("images_color")
    val imagesColor: String,
    @SerializedName("news_type")
    val newsType: String,
    @SerializedName("num")
    val num: String,
    @SerializedName("output")
    val output: String,
    @SerializedName("page")
    val page: String,
    @SerializedName("query")
    val query: String,
    @SerializedName("safe")
    val safe: String,
    @SerializedName("type")
    val type: String
)