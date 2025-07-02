NAME_APP = UserHandl
FILES = $(wildcard com/dataman/*.java)
EXEC = ./bin/$(NAME_APP)/bin/$(NAME_APP)

all:
	@echo "Dont use make only"

runtime:
	@rm -rf class bin manifest.mf
	@mkdir -p class bin
	@ecj -d class src/Main.java $(FILES)
	@echo "Main-Class: Main" > manifest.mf
	@jar cvfm bin/Main.jar manifest.mf -C class .
	@clear
	@java -jar bin/Main.jar

debug:
	rm -rf class bin manifest.mf
	mkdir -p class bin
	ecj -d class src/Main.java $(FILES)
	echo "Main-Class: Main" > manifest.mf
	jar cvfm bin/Main.jar manifest.mf -C class .

build:
	@rm -rf class bin manifest.mf
	@mkdir -p class bin
	@ecj -d class src/Main.java $(FILES)
	@echo "Main-Class: Main" > manifest.mf
	@jar cvfm bin/Main.jar manifest.mf -C class .
	@clear
	@jpackage --type app-image --input ./bin --name $(NAME_APP) --main-jar Main.jar --main-class Main --dest bin/

build-debug:
	rm -rf class bin manifest.mf
	mkdir -p class bin
	ecj -d class src/Main.java $(FILES)
	echo "Main-Class: Main" > manifest.mf
	jar cvfm bin/Main.jar manifest.mf -C class .
	jpackage --type app-image --input ./bin --name $(NAME_APP) --main-jar Main.jar --main-class Main --dest bin/

run-debug:
	@java -jar bin/Main.jar

run:
	@$(EXEC)

check:
	@jar tf bin/Main.jar

clean:
	@rm -rf class
	@rm -rf bin
	@rm -rf manifest.mf
