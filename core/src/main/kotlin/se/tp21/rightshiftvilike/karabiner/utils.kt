package se.tp21.rightshiftvilike.karabiner

fun String.camelToSnakeCase(): String = replace(Regex("([a-z])([A-Z]+)"), "$1_$2").lowercase()