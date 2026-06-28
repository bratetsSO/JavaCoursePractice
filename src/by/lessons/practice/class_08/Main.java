package by.lessons.practice.class_08;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String text = "Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов,\n" +
                "а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов.\n" +
                "Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов.\n" +
                "API мал и легок в применении, а его классы и методы просты для понимания.";
        Relative relative = new Relative();
        ReadFile read = new ReadFile();
        //File file = new File("src/Folder/test.txt");//относительный путь
        File fileabs = new File("C:\\install\\text.txt");//абсолютный путь
        //relative.writeForRelativeWay(text, file);
        //relative.writeForRelativeWay(text, fileabs);
        read.readFiletxt(fileabs);

    }
}
