package se.tp21.rightshiftvilike.karabiner

import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLike
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasEditing
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasNavigation
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasSymbols
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasTerminal
import sh.kau.karabiner.ComplexModifications

val rightShiftViLikesMap: Map<String, ComplexModifications> =
    mapOf(
        "rightShiftViLike" to rightShiftViLike(),
        "rightShiftViLikeExtrasEditing" to rightShiftViLikeExtrasEditing(),
        "rightShiftViLikeExtrasNavigation" to rightShiftViLikeExtrasNavigation(),
        "rightShiftViLikeExtrasSymbols" to rightShiftViLikeExtrasSymbols(),
        "rightShiftViLikeExtrasTerminal" to rightShiftViLikeExtrasTerminal(),
    )
