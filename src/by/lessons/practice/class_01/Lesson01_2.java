package by.lessons.practice.class_01;

import java.util.Scanner;

public class Lesson01_2 {
    public static void main(String[] args) {
        //1. Ввести числа a и b с консоли. Если a>b, то вывести разность (a-b) передав ее в новую переменную. Иначе если a=b  вывести сумму этих чисел.
        //Иначе, вывести разность b-a. Результат вычисления передать в новую переменную.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        int c;

        /*if (a > b) {
            c = a - b;
            System.out.println("c = " + c);
        } else if (a == b) {
            c = a + b;
            System.out.println("c = " + c);
        } else {
            c = b - a;
            System.out.println("c = " + c);
        }*/
        System.out.println("****************************");
        /*if(a%3==0){
            System.out.println("Число a делится на 3");
        } else {
            System.out.println("Число a не делится на 3");
        }*/
        System.out.println("***************************");
        if(a%3==0 && a%7==0 ){
            System.out.println("Число a делится на 3 и на 7");
        } else if (a%3==0) {
            System.out.println("Число a делится на 3");
        } else if (a%7==0){
            System.out.println("Число a делится на 7");
        }
    }
}
