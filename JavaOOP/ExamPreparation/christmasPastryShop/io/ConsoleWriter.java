package SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.io;

import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.io.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {
    public void writeLine(String text) {
        System.out.println(text);
    }
}
