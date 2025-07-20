package se.tp21.rightshiftvilike.karabiner.modifications

import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.FromModifiers
import sh.kau.karabiner.KeyCode
import sh.kau.karabiner.ModifierKeyCode
import sh.kau.karabiner.ModifierKeyCode.LeftCommand
import sh.kau.karabiner.ModifierKeyCode.LeftOption
import sh.kau.karabiner.ModifierKeyCode.LeftShift
import sh.kau.karabiner.ModifierKeyCode.RightShift
import sh.kau.karabiner.karabinerRule

fun rightShiftViLikeExtrasEditing(): ComplexModifications =
    ComplexModifications(
        title = "right shift vi like extras editing",
        rules = listOf(
            karabinerRule {
                description = "Single quote (right_shift+q to single quote)"
                mapping {
                    fromKey = KeyCode.Q
                    fromModifiers = FromModifiers(
                        mandatory = listOf(RightShift)
                    )
                    toKey = KeyCode.Quote
                }
            },
            karabinerRule {
                description = "Rename (right_shift+r to shift+f6)"
                mapping {
                    fromKey = KeyCode.R
                    fromModifiers = FromModifiers(
                        mandatory = listOf(RightShift)
                    )
                    toKey = KeyCode.F6
                    toModifiers = listOf(LeftShift)
                }
            }
        )
    )
