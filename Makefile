JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = Word.java Main.java

default: run

run: classes
	java Main

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

check: classes
	bash check.sh
