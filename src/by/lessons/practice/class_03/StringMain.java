package by.lessons.practice.class_03;

public class StringMain {
    public static void main(String[] args) {
        //1. Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
        StringLesson s1 = new StringLesson();
        s1.showStr("I like Java!!!");

        //конкатенация
        System.out.println(s1.concatStr("и раз", "и два"));


        //Проверить, заканчивается ли ваша строка подстрокой “java!”.
        s1.checkEndStr("I like java!!", "java!");

        /*2. Распечатать последний символ строки. Используем метод String.charAt().*/
        String str2 = "Какая-то строка Java наверно";
        char s = str2.charAt(str2.length()-1);
        System.out.println("Послдний символ -> " + s);

        /*Вырезать строку Java c помощью метода String.substring().*/
        String str3 = "Какая-то строка Java наверно";
        //int y1 =  str3.indexOf("Java");
        //int y2 =  str3.indexOf("Java")+4;

        String str33 = str3.substring(str3.indexOf("Java"),str3.indexOf("Java")+4);
        System.out.println(str33);
    }
}
