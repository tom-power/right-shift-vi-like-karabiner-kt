package se.tp21.rightshiftvilike.karabiner

import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLike
import sh.kau.karabiner.ComplexModifications

fun rightShiftViLikeModifications(): Map<String, ComplexModifications> =
    mapOf(
        "rightShiftViLike" to rightShiftViLike()
    )
