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
        FileReader("sample_translations.csv") // Replace with the name of your csv file pasted at the project root level
    )

    val reader = csvReaderBuilder
        .withCSVParser(rfc4180Parser)
        .build()

    val path = Paths.get("strings.xml") // Paste yout strings.xml file at the project root level. Overwrite the existing file if you're asked while pasting
    val charset: Charset = StandardCharsets.UTF_8

    var content = String(Files.readAllBytes(path), charset)

    reader.readAll().forEach {
        if (it.size >= 2) {
            content = content.replace(">" + it[it.size - 2] + "<", ">" + it[it.size - 1] + "<")
        }
    }

    try {
        FileWriter("strings_translated.xml").use { writer -> // This is the outfile and you can find it in the project root level
            writer.write(content)
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}