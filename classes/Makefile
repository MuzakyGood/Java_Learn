SETBIN = mkdir
JAR = Main
TARGET = Main Player App
CLS = $(wildcard ./*.class)
ECJ = ecj
JDK = java
SRC = $(wildcard *.java)

all:
	rm -rf ./bin
	$(SETBIN) bin
	$(ECJ) $(SRC)
	dx --dex --output=./bin/classes.dex Main.class Player.class App.class
	echo "Main-Class: Main" > manifest.mf
	jar cvfm ./bin/$(JAR).jar manifest.mf Main.class Player.class App.class
	$(JDK) -jar ./bin/Main.jar
clean:
	rm -rf ./bin
	rm -rf manifest.mf $(CLS)
