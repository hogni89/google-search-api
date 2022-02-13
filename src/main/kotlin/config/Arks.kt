package config

import com.apurebase.arkenv.Arkenv
import com.apurebase.arkenv.util.argument


object Arks : Arkenv() {

    val searchTerm: String? by argument("-s", "--search-term") {
        description = "Search string wrapped in quotes"
    }

    val searchTermFile: String? by argument("-sf", "--search-term-file") {
        description = "If one wishes to execute multiple searches and combine the result in one output file, " +
                "it is possible to provide a file with search terms instead of a single search term." +
                "See example file for inspiration"
    }

    val accessToken: String by argument("-t", "--token") {
        description = "SerpStack access token"
    }

    val outputFile: String by argument("-o", "--output-file") {
        description = "Path to output file containing result. Default path is ./"
        defaultValue = { "/" }
    }

    val searchCountry: String by argument("-c", "--country") {
        description = "Specify a country to use for your query. Default = US"
        defaultValue = { "us" }
    }

}