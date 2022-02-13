import ScrapeResponse.OrganicResult
import ScrapeResponse.OrganicResults
import com.apurebase.arkenv.util.parse
import com.google.gson.Gson
import com.google.gson.JsonObject
import config.Arks
import config.Settings.searchEndpoint
import java.net.URL


fun main(args: Array<String>) {
    Arks.parse(args)
    if (Arks.help) return

    val accessToken = Arks.accessToken!!
    val searchTerm = Arks.searchTerm!!
    val searchCountry = Arks.searchCountry!!


    val request =
        searchEndpoint +
                "?access_key=" + accessToken + "&" +
                "num=2000" + "&" +
                "query=" + searchTerm + "&" +
                "type=web" + "&" +
                "gl=" + searchCountry + "&"

    println(request)

    val response = URL(request).readText()

    println(response)
    val gson = Gson()
    val scrapeResponse = gson.fromJson(response, OrganicResults::class.java)

    println(scrapeResponse.toString())

}
