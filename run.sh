#!/usr/bin/env bash
javac -d out -sourcepath src src/pl/edu/agh/to/Main.java
java -classpath out pl.edu.agh.to.Main
