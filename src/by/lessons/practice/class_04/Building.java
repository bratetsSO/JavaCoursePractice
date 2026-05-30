package by.lessons.practice.class_04;

public class Building {
//    1.1 Создать класс Постройка (Building). Поля у класса Постройка: улица, материал стен, год постройки.
    private String street;
    private String wall;
    int year;

    public Building(String street, String wall, int year) {
        this.street = street;
        this.wall = wall;
        this.year = year;
    }
}
