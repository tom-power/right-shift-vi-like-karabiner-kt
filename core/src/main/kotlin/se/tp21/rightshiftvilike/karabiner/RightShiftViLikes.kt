package se.tp21.rightshiftvilike.karabiner

import se.tp21.rightshiftvilike.karabiner.rightshiftvilike.rightShiftViLike
import sh.kau.karabiner.ComplexModifications

fun rightShiftViLikes(): Map<String, ComplexModifications> =
    mapOf(
        "rightShiftViLike" to rightShiftViLike()
    )
