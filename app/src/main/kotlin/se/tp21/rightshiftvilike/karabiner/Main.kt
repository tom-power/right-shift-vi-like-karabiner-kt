package se.tp21.rightshiftvilike.karabiner

import sh.kau.karabiner.json
import java.io.File

fun main() {
    rightShiftViLikeModifications().forEach { (key, modifications) ->
        val fileName = keyToFileName[key]!!
        try {

            val outputFile = File("build/$fileName.json")
            val karabinerJson = json().encodeToString(modifications)
            outputFile.writeText(karabinerJson)
            println("Successfully wrote $fileName.json to ${outputFile.absolutePath}")
        } catch (e: Exception) {
            System.err.println("Error writing $fileName.json: ${e.message}")
            e.printStackTrace()
        }
    }

}
