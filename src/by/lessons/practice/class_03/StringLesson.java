package by.lessons.practice.class_03;

public class StringLesson {
    //конструктор
    public StringLesson() {

    }

    //1. Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
    public void showStr(String str) {
        //return str1;
        System.out.println(str);
    }
    //3. Проверить, заканчивается ли ваша строка подстрокой “java!”. Используем метод String.endsWith().
    public void checkEndStr(String str, String checkStr) {
        if (str.endsWith(checkStr)) {
            System.out.println("Строка оканчивается на " + checkStr);
        } else {
            System.out.println("Строка НЕ оканчивается на " + checkStr);
        }
    }

    // объединение строк
    public static String concatStr(String str1, String str2) {
        return str1 + " " + str2;
    }
}
