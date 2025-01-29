package SoftUniJavaOOP.ExamPreparationOOP.onlineShop.io;


import SoftUniJavaOOP.ExamPreparationOOP.onlineShop.io.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {
    @Override
    public void writeLine(String text) {
        System.out.println(text);
    }
}
