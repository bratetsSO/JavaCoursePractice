package by.lessons.practice.class_08;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainFarm {
    public static void main(String[] args) {
        // 5. Создать объект Ферма с полями.
        // Выполнить сериализацию  2 ферм и десериализацию в файл. (интерфейс Externelizibel)

        Farm farm1 = new Farm("Огонёк", 20000);
        Farm farm2 = new Farm("Зорачка", 355000);
        List<Farm> farm = new ArrayList<>();

        farm.add(farm1);
        farm.add(farm2);

        serialize(farm, "src/Folder/testss.txt");
        List<Farm> farms = deserialize("src/Folder/testss.txt");
        System.out.println(farms);
    }

    static String serialize(List<Farm> farm, String file) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(farm);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return file;
    }

    static List<Farm> deserialize(String file) {
        List<Farm> farm = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            farm = (List<Farm>) objectInputStream.readObject();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return farm;
    }
}

