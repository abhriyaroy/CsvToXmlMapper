import com.opencsv.CSVReaderBuilder
import com.opencsv.RFC4180ParserBuilder
import java.io.FileReader
import java.io.FileWriter
import java.io.IOException
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths


fun main(args: Array<String>) {
    val rfc4180Parser = RFC4180ParserBuilder().build()
    val csvReaderBuilder = CSVReaderBuilder(
        FileReader("sample_translations.csv")
    )

    val reader = csvReaderBuilder
        .withCSVParser(rfc4180Parser)
        .build()

    val path = Paths.get("strings.xml")
    val charset: Charset = StandardCharsets.UTF_8

    var content = String(Files.readAllBytes(path), charset)

    reader.readAll().forEach {
        if (it.size >= 2) {
            content = content.replace(">" + it[it.size - 2] + "<", ">" + it[it.size - 1] + "<")
        }
    }
//    Files.write(path, content.toByteArray(charset))
    try {
        FileWriter("strings_translated.xml").use { writer ->
            writer.write(content)
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}