package se.tp21.rightshiftvilike.karabiner.modifications

import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.FromModifiers
import sh.kau.karabiner.KeyCode
import sh.kau.karabiner.ModifierKeyCode.LeftCommand
import sh.kau.karabiner.ModifierKeyCode.LeftOption
import sh.kau.karabiner.ModifierKeyCode.RightShift
import sh.kau.karabiner.karabinerRule

fun rightShiftViLikeExtrasNavigation(): ComplexModifications =
    ComplexModifications(
        title = "right shift vi like extras navigation",
        rules = listOf(
            karabinerRule {
                description = "Go back (right_shift+cmd+option+h to cmd+[)"
                mapping {
                    fromKey = KeyCode.H
                    fromModifiers = FromModifiers(
                        mandatory = listOf(RightShift, LeftCommand, LeftOption)
                    )
                    toKey = KeyCode.OpenBracket
                    toModifiers = listOf(LeftCommand)
                }
            },
            karabinerRule {
                description = "Go forward (right_shift+cmd+option+l to cmd+])"
                mapping {
                    fromKey = KeyCode.L
                    fromModifiers = FromModifiers(
                        mandatory = listOf(RightShift, LeftCommand, LeftOption)
                    )
                    toKey = KeyCode.CloseBracket
                    toModifiers = listOf(LeftCommand)
                }
            }
        )
    )