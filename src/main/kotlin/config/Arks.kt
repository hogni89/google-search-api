package config

import com.apurebase.arkenv.Arkenv
import com.apurebase.arkenv.util.argument


object Arks : Arkenv() {

    val searchTerm: String? by argument("-s", "--search-term") {
        description = "Search string wrapped in quotes"
    }

    val accessToken: String by argument("-t", "--token") {
        description = "SerpStack access token"
    }

    val searchCountry: String by argument("-c", "--country") {
        description = "Specify a country to use for your query. Default = US"
        defaultValue = { "us" }
    }

    val outputFileName: String by argument("-o", "--output-file") {
        defaultValue = { "result" }
    }

}