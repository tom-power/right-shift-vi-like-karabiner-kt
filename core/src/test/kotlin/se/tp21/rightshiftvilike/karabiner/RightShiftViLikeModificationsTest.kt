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

    @ParameterizedTest
    @MethodSource("keyToModification")
    fun `snippets rules are correct`(key: String, modifications: ComplexModifications) {
        assertEquals(
            expected = javaClass.getResource("/${key.camelToSnakeCase()}.json")!!.readText().trimAll(),
            actual = json().encodeToString(modifications).trimAll(),
        )
    }

    @Suppress("unused")
    private fun keyToModification() =
        rightShiftViLikeModificationsMap().toList().map { (key, modifications) -> Arguments.of(key, modifications) }

}

private fun String.trimAll() = trimStart().trimEnd().trimIndent()

private fun String.camelToSnakeCase(): String = replace(Regex("([a-z])([A-Z]+)"), "$1_$2").lowercase()
