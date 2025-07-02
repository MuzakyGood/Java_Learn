TARGET = Main
CLS = Main.class
ECJ = ecj
JDK = java
SRC = $(wildcard *.java)

all:
	$(ECJ) $(SRC)
	dx --dex --output=./bin/$(TARGET).dex $(CLS)
	jar cvfe ./bin/$(TARGET).jar $(TARGET) $(CLS)
	$(JDK) -jar ./bin/$(TARGET).jar
clean:
	rm -rf Main.dex Main.jar Main.class
