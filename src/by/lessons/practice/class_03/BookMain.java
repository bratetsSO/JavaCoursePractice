package by.lessons.practice.class_03;

import static by.lessons.practice.class_03.Book.fltrBook;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book(111, "Букварь", "Пушкин", "Изд", 1979, 123, 52);

        //String b1 = book1.info();
        String b2 = book2.info();

        System.out.println(book1.info());
        System.out.println(b2);

        //смена цены
        book2.changePrice(70.5);
        System.out.println("Вывод после смены стоимости:");
        b2 = book2.info();
        System.out.println(b2);


        //вывод массива книг (задача 4)
        Book[] arrBook = arrayBook();
        System.out.println("Вывод массива книг:");
        for (Book x : arrBook) {
            System.out.println(x.info());
        }

        // фильтрация массива по году (задача 5)
        int fltrYear = 1985;
        Book[] arrBookFltr = fltrBook(arrayBook(), fltrYear);
        System.out.println("Вывод отфильтрованного массива книг не старшее "+fltrYear+" года");
        for (Book x : arrBookFltr) {
            System.out.println(x.info());
        }
    }

    /*4 В классе main создать массив из пяти книг*/
    public static Book[] arrayBook() {
        Book book7 = new Book(111, "Букварь", "Пушкин", "Изд", 1979, 123, 52);
        Book book3 = new Book(222, "Букварь", "Пушкин", "Изд", 1981, 123, 52);
        Book book4 = new Book(333, "Букварь", "Пушкин", "Изд", 1983, 123, 52);
        Book book5 = new Book(444, "Букварь", "Пушкин", "Изд", 1985, 123, 52);
        Book book6 = new Book(555, "Букварь", "Пушкин", "Изд", 1990, 123, 52);
        Book[] arrBook = new Book[5];
        arrBook[0] = book7;
        arrBook[1] = book3;
        arrBook[2] = book4;
        arrBook[3] = book5;
        arrBook[4] = book6;
        return arrBook;
    }
}
