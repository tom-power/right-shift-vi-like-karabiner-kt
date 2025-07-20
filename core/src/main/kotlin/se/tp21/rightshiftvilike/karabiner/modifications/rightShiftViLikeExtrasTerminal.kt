package se.tp21.rightshiftvilike.karabiner.modifications

import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.FromModifiers
import sh.kau.karabiner.KeyCode
import sh.kau.karabiner.ModifierKeyCode
import sh.kau.karabiner.ModifierKeyCode.Fn
import sh.kau.karabiner.ModifierKeyCode.RightCommand
import sh.kau.karabiner.ModifierKeyCode.RightShift
import sh.kau.karabiner.karabinerRule

fun rightShiftViLikeExtrasTerminal(): ComplexModifications =
    ComplexModifications(
        title = "right shift vi like extras terminal",
        rules = listOf(
            karabinerRule {
                description = "Home not terminal (right_shift+a to right_command+left_arrow)"
                mapping {
                    fromKey = KeyCode.A
                    fromModifiers = FromModifiers(
                        mandatory = listOf(RightShift),
                        optional = listOf(ModifierKeyCode.Any)
                    )
                    toKey = KeyCode.LeftArrow
                    toModifiers = listOf(RightCommand)
                    unlessApp {
                        bundleIds =
                            listOf(
                                "^com\\.jetbrains\\.intellij$",
                                "^com\\.jetbrains\\.intellij\\.ce$",
                                "^com\\.jetbrains\\.intellij-EAP$",
                                "^com\\.googlecode\\.iterm2$",
                                "^com\\.microsoft\\.VSCode$",
                                "^com\\.jetbrains\\.pycharm\\.ce$"
                            )
                    }
                }
            },
            karabinerRule {
                description = "Home terminal (right_shift+a to fn+left_arrow)"
                mapping {
                    fromKey = KeyCode.A
                    fromModifiers = FromModifiers(
                        mandatory = listOf(RightShift),
                        optional = listOf(ModifierKeyCode.Any)
                    )
                    toKey = KeyCode.LeftArrow
                    toModifiers = listOf(Fn)
                    forApp {
                        bundleIds =
                            listOf(
                                "^com\\.jetbrains\\.intellij$",
                                "^com\\.jetbrains\\.intellij\\.ce$",
                                "^com\\.jetbrains\\.intellij-EAP$",
                                "^com\\.googlecode\\.iterm2$",
                                "^com\\.microsoft\\.VSCode$",
                                "^com\\.jetbrains\\.pycharm\\.ce$"
                            )
                    }
                }
            },
            karabinerRule {
                description = "End not terminal (right_shift+e to right_command+right_arrow)"
                mapping {
                    fromKey = KeyCode.E
                    fromModifiers = FromModifiers(
                        mandatory = listOf(RightShift),
                        optional = listOf(ModifierKeyCode.Any)
                    )
                    toKey = KeyCode.RightArrow
                    toModifiers = listOf(RightCommand)
                    unlessApp {
                        bundleIds =
                            listOf(
                                "^com\\.jetbrains\\.intellij$",
                                "^com\\.jetbrains\\.intellij\\.ce$",
                                "^com\\.jetbrains\\.intellij-EAP$",
                                "^com\\.googlecode\\.iterm2$",
                                "^com\\.microsoft\\.VSCode$",
                                "^com\\.jetbrains\\.pycharm\\.ce$"
                            )
                    }
                }
            },
            karabinerRule {
                description = "End terminal (right_shift+e to fn+right_arrow)"
                mapping {
                    fromKey = KeyCode.E
                    fromModifiers = FromModifiers(
                        mandatory = listOf(RightShift),
                        optional = listOf(ModifierKeyCode.Any)
                    )
                    toKey = KeyCode.RightArrow
                    toModifiers = listOf(Fn)
                    forApp {
                        bundleIds =
                            listOf(
                                "^com\\.jetbrains\\.intellij$",
                                "^com\\.jetbrains\\.intellij\\.ce$",
                                "^com\\.jetbrains\\.intellij-EAP$",
                                "^com\\.googlecode\\.iterm2$",
                                "^com\\.microsoft\\.VSCode$",
                                "^com\\.jetbrains\\.pycharm\\.ce$"
                            )
                    }
                }
            }
        )
    )