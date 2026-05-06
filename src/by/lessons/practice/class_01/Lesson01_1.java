package by.lessons.practice.class_01;

public class Lesson01_1 {
    public static void main(String[] args) {
        /*
        int a;
        a = 88/(10+12);
        System.out.println(a);
        System.out.println("***************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        int x = sc.nextInt();
        System.out.println("Введите y");
        int y = sc.nextInt();
        System.out.println("Введите z");
        int z = sc.nextInt();

        int res2 = (x+y*z);
        System.out.println("Результат выполнения второго задания: " + res2);

        System.out.println("***************************");
        // Дано уравнение 213/x+258/x+60=217. Найдите x
        int res3;
        res3 = (213+258)/(217-60);
        System.out.println("Результат выполнения третьего задания: " + res3);
         */
        System.out.println("***************************");
        //* 6. Даны значения: x=5; y=2; c=x*y;
        //* 6.2 Расставьте операции инкремента декремента так,
        //* чтобы после выполнения операции (c=x*y) с=10; x=6; y=1
        int i = 5;
        int j = 2;
        int c;
        c = i++ * j--;
        System.out.println("Результат выполнения четвертого задания: c = " + c);
        System.out.println("Результат выполнения четвертого задания: i = " + i);
        System.out.println("Результат выполнения четвертого задания: j = " + j);
    }
}
