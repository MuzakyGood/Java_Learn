NAME_APP = Argtest

all:
	@echo "Dont use make only"

runtime:
	@rm -rf class bin manifest.mf
	@mkdir -p class bin
	@ecj -d class src/Main.java # Add another java external files
	@echo "Main-Class: Main" > manifest.mf
	@jar cvfm bin/Main.jar manifest.mf -C class .
	@clear
	@java -jar bin/Main.jar

debug:
	rm -rf class bin manifest.mf
	mkdir -p class bin
	ecj -d class src/Main.java # Add another java external files
	echo "Main-Class: Main" > manifest.mf
	jar cvfm bin/Main.jar manifest.mf -C class .

build:
	@rm -rf class bin manifest.mf
	@mkdir -p class bin
	@ecj -d class src/Main.java # Add another java external files
	@echo "Main-Class: Main" > manifest.mf
	@jar cvfm bin/Main.jar manifest.mf -C class .
	@clear
	@jpackage --type app-image --input ./bin --name $(NAME_APP) --main-jar Main.jar --main-class Main --dest bin/

build-debug:
	rm -rf class bin manifest.mf
	mkdir -p class bin
	ecj -d class src/Main.java # Add another java external files
	echo "Main-Class: Main" > manifest.mf
	jar cvfm bin/Main.jar manifest.mf -C class .
	jpackage --type app-image --input ./bin --name $(NAME_APP) --main-jar Main.jar --main-class Main --dest bin/

run-debug:
	@java -jar bin/Main.jar

run:
	@./bin/Main/bin/Main

check:
	@jar tf bin/Main.jar

clean:
	@rm -rf class
	@rm -rf bin
	@rm -rf manifest.mf
