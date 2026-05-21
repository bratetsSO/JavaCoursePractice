package by.lessons.practice.class_03;

public class Book {
    /* 1 Создать класс Book c полями id (тип int), name (тип String), author (тип String), издательство ( тип String ), Год издания(тип Int), Количество страниц (тип int), цена (double).
        Инициализацию книги в классе main выполнять через конструктор с параметрами. Также определите конструктор без параметров.
    */
    int id;
    String name;
    String author;
    String publishing;
    int year;
    int quantity;
    double price;

    //конструктор с параметрами
    public Book(int id, String name, String author, String publishing, int year, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.quantity = quantity;
        this.price = price;
    }

    // //конструктор без параметров
    public Book() {
        //System.out.println("Конструктор без параметров");
    }

    /*2 Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info*/
    public String info() {
        String res = "id = " + id + ", Наименование - " + name + ", Автор - " + author + ", Издательство - " + publishing + ", Год - " + year + ", Количество страниц - " + quantity + ", Цена - " + price;
        return res; // тип String

    }

    /*3 Создать метод, который будет изменять цену книги (сам метод в качестве параметра будет принимать новую цену)*/
    public void changePrice(double newPrice) {
        this.price = newPrice;
    }

    /*5 Создать метод в классе Book, который будет принимать массив книг
    и возвращать массив книг, у которых год издания ниже переданного года в методе.*/
    public static Book[] fltrBook(Book[] arrBook, int year) {
        //считаем количество
        int count = 0;
        for (Book x : arrBook) {
            if (x.year < year){
                count++;
            }
        }
        //предполагаем, что новый массив не пустой
        //создаем новый массив
        Book[] arrBookReturn = new Book[count];
        int i=0;

        //заполняем новый массив
        for (Book x : arrBook) {
            if (x.year < year){
                arrBookReturn[i]=x;
                i++;
            }
        }
        return arrBookReturn;
    }
}
