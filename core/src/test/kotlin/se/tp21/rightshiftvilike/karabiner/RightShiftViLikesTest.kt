package se.tp21.rightshiftvilike.karabiner

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import se.tp21.resourcesapproval.ResourcesApproval
import se.tp21.resourcesapproval.WriteTo
import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.json

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RightShiftViLikesTest {

    @ParameterizedTest
    @MethodSource("rightShiftViLikes")
    fun `snippets rules are correct`(key: String, modifications: ComplexModifications) {
        ResourcesApproval.assertApproved(
            actual = json().encodeToString(modifications),
            approved = "${key.camelToSnakeCase()}.json",
            writeTo = WriteTo.Approved,
        )
    }

    @Suppress("unused")
    private fun rightShiftViLikes() =
        rightShiftViLikesMap.toList().map { (key, modifications) ->
            Arguments.of(key, modifications)
        }

}
