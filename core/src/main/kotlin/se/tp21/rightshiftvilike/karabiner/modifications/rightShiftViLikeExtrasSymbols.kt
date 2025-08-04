package se.tp21.rightshiftvilike.karabiner.modifications

import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.From
import sh.kau.karabiner.FromModifiers
import sh.kau.karabiner.KeyCode
import sh.kau.karabiner.ModifierKeyCode.LeftShift
import sh.kau.karabiner.ModifierKeyCode.RightShift
import sh.kau.karabiner.To
import sh.kau.karabiner.karabinerRule

fun rightShiftViLikeExtrasSymbols(): ComplexModifications =
    ComplexModifications(
        title = "right shift vi like extras symbols",
        rules = listOf(
            karabinerRule {
                description = "Thin arrow (right_shift+- to ->)"
                mapping {
                    from = From.with(
                        KeyCode.Hyphen,
                        FromModifiers(mandatory = listOf(RightShift))
                    )
                    to = listOf(
                        To(KeyCode.Hyphen),
                        To(KeyCode.Period, modifiers = listOf(LeftShift))
                    )
                }
            },
            karabinerRule {
                description = "Fat arrow (right_shift+= to =>)"
                mapping {
                    from = From.with(
                        KeyCode.EqualSign,
                        FromModifiers(mandatory = listOf(RightShift))
                    )
                    to = listOf(
                        To(KeyCode.EqualSign),
                        To(KeyCode.Period, modifiers = listOf(LeftShift))
                    )
                }
            },
            karabinerRule {
                description = "./ (right_shift+i to ./)"
                mapping {
                    from = From.with(
                        KeyCode.I,
                        FromModifiers(mandatory = listOf(RightShift))
                    )
                    to = listOf(
                        To(KeyCode.Period),
                        To(KeyCode.Slash)
                    )
                }
            },
            karabinerRule {
                description = "../ (right_shift+left_shift+i to ../)"
                mapping {
                    from = From.with(
                        KeyCode.I,
                        FromModifiers(mandatory = listOf(LeftShift, RightShift))
                    )
                    to = listOf(
                        To(KeyCode.Period),
                        To(KeyCode.Period),
                        To(KeyCode.Slash)
                    )
                }
            },
            karabinerRule {
                description = "~/ (right_shift+` to ~/)"
                mapping {
                    from = From.with(
                        KeyCode.GraveAccentAndTilde,
                        FromModifiers(mandatory = listOf(RightShift))
                    )
                    to = listOf(
                        To(KeyCode.GraveAccentAndTilde, modifiers = listOf(LeftShift)),
                        To(KeyCode.Slash)
                    )
                }
            }
        )
    )