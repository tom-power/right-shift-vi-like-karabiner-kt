package se.tp21.rightshiftvilike.karabiner

import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLike
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasNavigation
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasSymbols
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasTerminal
import sh.kau.karabiner.ComplexModifications

fun rightShiftViLikeModificationsMap(): Map<String, ComplexModifications> =
    mapOf(
        "rightShiftViLike" to rightShiftViLike(),
        "rightShiftViLikeExtrasNavigation" to rightShiftViLikeExtrasNavigation(),
        "rightShiftViLikeExtrasSymbols" to rightShiftViLikeExtrasSymbols(),
        "rightShiftViLikeExtrasTerminal" to rightShiftViLikeExtrasTerminal(),
    )
