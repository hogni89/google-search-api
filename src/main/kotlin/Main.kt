import com.apurebase.arkenv.util.parse
import config.Arks


fun main(args: Array<String>) {
    Arks.parse(args)

    println(Arks.accessToken)
    println(Arks.searchTerm)
    println(Arks.outputFile)
}
