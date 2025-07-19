package se.tp21.rightshiftvilike.karabiner

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.json
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RightShiftVilLikesTest {

    private val rightShiftVilLikes: Map<String, ComplexModifications> = rightShiftViLikes()

    @ParameterizedTest
    @MethodSource("keyToFileName")
    fun `snippets rules are correct`(key: String, fileName: String) {
        assertEquals(
            expected = javaClass.getResource("/${fileName}.json")!!.readText().trimAll(),
            actual = json().encodeToString(rightShiftVilLikes[key]!!).trimAll(),
        )
    }

    @Suppress("unused")
    private fun keyToFileName() =
        keyToFileName.toList().map { (key, fileName) -> Arguments.of(key, fileName) }

}

private fun String.trimAll() = trimStart().trimEnd().trimIndent()

