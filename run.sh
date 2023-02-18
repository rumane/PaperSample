#!/bin/bash

./gradlew build
mv ./build/libs/PaperSample-dev.jar ~/bukkit/plugins/
cd ~/bukkit || exit
java -jar paper.jar nogui