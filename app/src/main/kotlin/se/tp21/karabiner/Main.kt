package se.tp21.karabiner

import se.tp21.karabiner.utils.jsonEncoder
import java.io.File

fun main() {
    larks().forEach { (t, u) ->
        val karabinerJson = jsonEncoder(u)
        try {
            val outputFile = File("build/larks_$t.json")
            outputFile.writeText(karabinerJson)
            println("Successfully wrote larks_$t.json to ${outputFile.absolutePath}")
        } catch (e: Exception) {
            System.err.println("Error writing karabiner.json: ${e.message}")
            e.printStackTrace()
        }
    }

}
