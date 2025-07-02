SETBIN = mkdir
SETCLASS = mkdir
JAR = Main
CLS = $(wildcard ./class/*.class)
ECJ = ecj
JDK = java
SRC = $(wildcard *.java)

all:
	@rm -rf ./bin
	@rm -rf ./class
	@$(SETBIN) bin
	@$(SETCLASS) class
	@$(ECJ) -d ./class $(SRC)
	@dx --dex --output=./bin/classes.dex class/
	@echo "Main-Class: Main" > manifest.mf
	@jar cvfm ./bin/$(JAR).jar manifest.mf -C class/ .
	@clear
	@$(JDK) -jar ./bin/Main.jar

debug:
	rm -rf ./bin
	rm -rf ./class
	$(SETBIN) bin
	$(SETCLASS) class
	$(ECJ) -d ./class $(SRC)
	dx --dex --output=./bin/classes.dex class/
	echo "Main-Class: Main" > manifest.mf
	jar cvfm ./bin/$(JAR).jar manifest.mf -C class/ .
	$(JDK) -jar ./bin/Main.jar
clean:
	@rm -rf ./bin
	@rm -rf ./class
	@rm -rf manifest.mf $(CLS)
