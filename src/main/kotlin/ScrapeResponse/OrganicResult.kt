package ScrapeResponse


import com.google.gson.annotations.SerializedName

data class OrganicResult(
    @SerializedName("cached_page_url")
    val cachedPageUrl: CachedPageUrl,
    @SerializedName("displayed_url")
    val displayedUrl: String,
    @SerializedName("domain")
    val domain: String,
    @SerializedName("position")
    val position: Int,
    @SerializedName("prerender")
    val prerender: Boolean,
    @SerializedName("related_pages_url")
    val relatedPagesUrl: RelatedPagesUrl,
    @SerializedName("snippet")
    val snippet: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String
)