SETBIN = mkdir
SETCLASS = mkdir
JAR = Main
ECJ = ecj
JDK = java
MAINSRC = $(wildcard *.java)
EXSRC = $(wildcard ./calcjava/*.java)

all:
	rm -rf ./bin
	rm -rf ./class
	$(SETBIN) bin
	$(SETCLASS) class
	$(ECJ) -d ./class $(MAINSRC) $(EXSRC)
	dx --dex --output=./bin/classes.dex class/
	echo "Main-Class: Main" > manifest.mf
	jar cvfm ./bin/$(JAR).jar manifest.mf -C class/ .
	$(JDK) -jar ./bin/Main.jar
clean:
	rm -rf ./bin
	rm -rf ./class
	rm -rf manifest.mf $(CLS)
