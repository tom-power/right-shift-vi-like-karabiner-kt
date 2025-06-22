package se.tp21.karabiner

import se.tp21.karabiner.larks.*
import sh.kau.karabiner.ComplexModifications

fun larks(): Map<String, ComplexModifications> =
    mapOf(
        "commandControl" to commandControl(),
        "macToPc" to macToPc(),
        "navigation" to navigation(),
        "noQuit" to noQuit(),
        "wrap" to wrap(),
    )
