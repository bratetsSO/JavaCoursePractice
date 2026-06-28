package by.lessons.practice.class_08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileRelativeWay {


    public static void main(String[] args) throws IOException {

        String text = "Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов,\n" +
                "а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов.\n" +
                "Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов.\n" +
                "API мал и легок в применении, а его классы и методы просты для понимания.";
        File file = new File("src/Folder/test.txt");//относительный путь
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter(file);
//            writer.write(text);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            writer.close();
//        }

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}


