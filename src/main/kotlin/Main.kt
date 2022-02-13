import ScrapeResponse.ScrapeResult
import com.apurebase.arkenv.util.parse
import com.google.gson.Gson
import config.Arks
import config.ExportObject
import config.Settings.searchEndpoint
import java.io.File
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
    val scrapeResponse = gson.fromJson(response, ScrapeResult::class.java)

    val urls = scrapeResponse
        .organicResults
        .map {
            ExportObject(
                url = it.url,
                domain = it.domain,
                title = it.title
            )
        }

    File("clinics_in_goteborg.txt").printWriter().use { out ->
        urls.forEach {
            out.println("'${it.title}'|'${it.domain}'|'${it.url}'" )
        }
    }
}
