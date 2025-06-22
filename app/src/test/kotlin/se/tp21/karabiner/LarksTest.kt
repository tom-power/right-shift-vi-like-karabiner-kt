package se.tp21.karabiner

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.jsonEncoder

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LarksTest {

    private val larks: Map<String, ComplexModifications> = larks()

    @ParameterizedTest
    @MethodSource("larksKeys")
    fun `snippets rules are correct`(key: String) {

        kotlin.test.assertEquals(
            expected = javaClass.getResource("/larks_$key.json")!!.readText().trimAll(),
            actual = jsonEncoder(larks[key]!!).trimAll(),
        )
    }

    private fun larksKeys() =
        listOf(
            "commandControl",
            "macToPc",
            "navigation",
            "noQuit",
            "wrap",
        )

}

private fun String.trimAll() = trimStart().trimEnd().trimIndent()
