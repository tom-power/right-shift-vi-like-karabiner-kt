package se.tp21.karabiner

import se.tp21.karabiner.larks.commandControl
import se.tp21.karabiner.larks.macToPc
import sh.kau.karabiner.ComplexModifications

fun larks(): Map<String, ComplexModifications> =
    mapOf(
        "commandControl" to commandControl(),
        "macToPc" to macToPc()
    )
