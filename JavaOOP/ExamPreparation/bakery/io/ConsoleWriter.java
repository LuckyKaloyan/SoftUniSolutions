package SoftUniJavaOOP.ExamPreparationOOP.bakery.io;


import SoftUniJavaOOP.ExamPreparationOOP.bakery.io.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {
    public void writeLine(String text) {
        System.out.println(text);
    }
}
