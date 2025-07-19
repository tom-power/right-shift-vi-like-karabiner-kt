### build for [right-shift-vi-like-karabiner](https://github.com/tom-power/right-shift-vi-like-karabiner) using [karabiner-kt](https://github.com/tom-power/karabiner-kt)

```shell
clone https://github.com/tom-power/right-shift-vi-like-karabiner-kt.git &&
cd right-shift-vi-like-karabiner-kt &&
./gradlew build &&
cp ./app/build/*.json ~/.config/karabiner/assets/complex_modifications/
```

The rules will need to be loaded in the Karabiner elements UI:

```"Preferences" -> "Complex Modifications" -> "Add rule" -> "right-shift-vi-like ..." -> "Enable all"```