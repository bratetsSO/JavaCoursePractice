package by.lessons.practice.class_07;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1. Заполнить HashMap 10 объектами <Integer, String>.
        // Найти строки у которых ключ>5. вывести строки в коллекцию.
        // Перемножить все ключи, где длина строки>5.
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "пер");
        map.put(1, "второй");
        map.put(2, "третий");
        map.put(3, "четвертый");
        map.put(4, "пятый");
        map.put(5, "шестой");
        map.put(6, "седьмой");
        map.put(7, "восьмой");
        map.put(8, "девятый");
        map.put(9, "десятый");

        List<String> newList = new ArrayList<>();
        for (Map.Entry<Integer, String> x : map.entrySet()) {
            if (x.getKey() > 5) {
                newList.add(x.getValue());
            }
        }

        int comp = 1;
        Set<Integer> keyList = map.keySet();
        for (Integer x : keyList) {
            if (map.get(x).length() > 5) {//map.get(x) - вернет value (String)
                comp *= x;
            }
        }
        System.out.println("Произведение = " + comp);
    }
}
