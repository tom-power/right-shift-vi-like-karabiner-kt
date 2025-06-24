### larky [Karabiner elements](https://github.com/tekezo/Karabiner-Elements) bindings for MacOS.

```shell
clone https://github.com/tom-power/larks-karabiner-kt.git &&
cd larks-karabiner-kt &&
./gradlew build &&
cp ./app/build/*.json ~/.config/karabiner/assets/complex_modifications/
```

The rules will need to be loaded in the Karabiner elements UI:

```"Preferences" -> "Complex Modifications" -> "Add rule" -> "snippets ..." -> "Enable all"```

To make a change update `snippetRules.json`, then `./gradlew run --args="/path/to/snippetRules.json"`, then remove and add all rules.
