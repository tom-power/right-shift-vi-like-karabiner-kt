package se.tp21.karabiner

import sh.kau.karabiner.jsonEncoder
import java.io.File

fun main() {
    larks().forEach { (key, modifications) ->
        try {
            val outputFile = File("build/larks_$key.json")
            val karabinerJson = jsonEncoder(modifications)
            outputFile.writeText(karabinerJson)
            println("Successfully wrote larks_$key.json to ${outputFile.absolutePath}")
        } catch (e: Exception) {
            System.err.println("Error writing karabiner.json: ${e.message}")
            e.printStackTrace()
        }
    }

}
