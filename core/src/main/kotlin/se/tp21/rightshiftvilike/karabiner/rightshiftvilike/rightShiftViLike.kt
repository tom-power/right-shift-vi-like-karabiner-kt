package se.tp21.rightshiftvilike.karabiner.rightshiftvilike

import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.FromModifiers

import sh.kau.karabiner.KeyCode
import sh.kau.karabiner.ModifierKeyCode
import sh.kau.karabiner.ModifierKeyCode.Fn
import sh.kau.karabiner.ModifierKeyCode.LeftCommand
import sh.kau.karabiner.ModifierKeyCode.LeftOption
import sh.kau.karabiner.ModifierKeyCode.LeftShift
import sh.kau.karabiner.ModifierKeyCode.RightCommand
import sh.kau.karabiner.ModifierKeyCode.RightShift
import sh.kau.karabiner.karabinerRule

fun rightShiftViLike(): ComplexModifications =
    ComplexModifications(
        title = "right shift vi like",
        rules = listOf(
            karabinerRule {
                description = "Right (right_shift+l to right)"
                mapping {
                    fromKey = KeyCode.L
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.RightArrow
                }
            },
            karabinerRule {
                description = "Down (right_shift+j to down)"
                mapping {
                    fromKey = KeyCode.J
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.DownArrow
                }
            },
            karabinerRule {
                description = "Left (right_shift+h to left)"
                mapping {
                    fromKey = KeyCode.H
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.LeftArrow
                }
            },
            karabinerRule {
                description = "Up (right_shift+k to up)"
                mapping {
                    fromKey = KeyCode.K
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.UpArrow
                }
            },
            karabinerRule {
                description = "End (right_shift+e to fn+right)"
                mapping {
                    fromKey = KeyCode.E
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.RightArrow
                    toModifiers = listOf(Fn)
                }
            },
            karabinerRule {
                description = "Home (right_shift+a to fn+left)"
                mapping {
                    fromKey = KeyCode.A
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.LeftArrow
                    toModifiers = listOf(Fn)
                }
            },
            karabinerRule {
                description = "Word forward (right_shift+w to option+right)"
                mapping {
                    fromKey = KeyCode.W
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.RightArrow
                    toModifiers = listOf(LeftOption)
                }
            },
            karabinerRule {
                description = "Word back (right_shift+b to option+left)"
                mapping {
                    fromKey = KeyCode.B
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.LeftArrow
                    toModifiers = listOf(LeftOption)
                }
            },
            karabinerRule {
                description = "Page up (right_shift+p to page_up)"
                mapping {
                    fromKey = KeyCode.P
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.PageUp
                }
            },
            karabinerRule {
                description = "Page down (right_shift+; to page_down)"
                mapping {
                    fromKey = KeyCode.Semicolon
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.PageDown
                }
            },
            karabinerRule {
                description = "Copy (right_shift+c to c+command)"
                mapping {
                    fromKey = KeyCode.C
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift))
                    toKey = KeyCode.C
                    toModifiers = listOf(RightCommand)
                }
            },
            karabinerRule {
                description = "Cut (right_shift+x to x+command)"
                mapping {
                    fromKey = KeyCode.X
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift))
                    toKey = KeyCode.X
                    toModifiers = listOf(RightCommand)
                }
            },
            karabinerRule {
                description = "Paste (right_shift+v to v+command)"
                mapping {
                    fromKey = KeyCode.V
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift))
                    toKey = KeyCode.V
                    toModifiers = listOf(RightCommand)
                }
            },
            karabinerRule {
                description = "Undo (right_shift+z to z+command)"
                mapping {
                    fromKey = KeyCode.Z
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift))
                    toKey = KeyCode.Z
                    toModifiers = listOf(RightCommand)
                }
            },
            karabinerRule {
                description = "Save (right_shift+s to s+command)"
                mapping {
                    fromKey = KeyCode.S
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift))
                    toKey = KeyCode.S
                    toModifiers = listOf(RightCommand)
                }
            },
            karabinerRule {
                description = "New tab (right_shift+t to t+command)"
                mapping {
                    fromKey = KeyCode.T
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift))
                    toKey = KeyCode.T
                    toModifiers = listOf(RightCommand)
                }
            },
            karabinerRule {
                description = "Close tab (right_shift+y to w+command)"
                mapping {
                    fromKey = KeyCode.Y
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift))
                    toKey = KeyCode.W
                    toModifiers = listOf(RightCommand)
                }
            },
            karabinerRule {
                description = "Escape (left_command+space to escape)"
                mapping {
                    fromKey = KeyCode.Spacebar
                    fromModifiers = FromModifiers(mandatory = listOf(LeftCommand), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.Escape
                }
            },
            karabinerRule {
                description = "Return (right_shift+m to return)"
                mapping {
                    fromKey = KeyCode.M
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.ReturnOrEnter
                }
            },
            karabinerRule {
                description = "Delete (right_shift+f to delete)"
                mapping {
                    fromKey = KeyCode.F
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.DeleteForward
                }
            },
            karabinerRule {
                description = "Backspace (right_shift+d to backspace)"
                mapping {
                    fromKey = KeyCode.D
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift))
                    toKey = KeyCode.DeleteOrBackspace
                }
            },
            karabinerRule {
                description = "Tab (right_shift+space to tab)"
                mapping {
                    fromKey = KeyCode.Spacebar
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.Tab
                }
            },
            karabinerRule {
                description = "Go to tab to left (right_shift+u to cmd+shift+[)"
                mapping {
                    fromKey = KeyCode.U
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift))
                    toKey = KeyCode.OpenBracket
                    toModifiers = listOf(LeftCommand, LeftShift)
                }
            },
            karabinerRule {
                description = "Go to tab to right (right_shift+o to cmd+shift+])"
                mapping {
                    fromKey = KeyCode.O
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift))
                    toKey = KeyCode.CloseBracket
                    toModifiers = listOf(LeftCommand, LeftShift)
                }
            },
            karabinerRule {
                description = "Spotlight (left_command+return to left_command+spacebar)"
                mapping {
                    fromKey = KeyCode.ReturnOrEnter
                    fromModifiers = FromModifiers(mandatory = listOf(LeftCommand))
                    toKey = KeyCode.Spacebar
                    toModifiers = listOf(LeftCommand)
                }
            },
            karabinerRule {
                description = "Search focus (right_shift+g to l+command)"
                mapping {
                    fromKey = KeyCode.G
                    fromModifiers = FromModifiers(mandatory = listOf(RightShift))
                    toKey = KeyCode.L
                    toModifiers = listOf(RightCommand)
                }
            }

        )
    )