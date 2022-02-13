package config

import com.apurebase.arkenv.Arkenv
import com.apurebase.arkenv.util.argument


object Arks : Arkenv() {

    val searchTerm: String by argument("-s", "--search-term") {
        description = "Search string wrapped in quotes"
    }

    val accessToken: String by argument("-t", "--token") {
        description = "SerpStack access token"
    }

    val outputFile: String by argument("-o", "--output-file") {
        description = "Path to output file containing result. Default path is ./"
        defaultValue = { "/" }
    }

}