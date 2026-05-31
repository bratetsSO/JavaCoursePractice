package by.lessons.practice.class_04;

public class Fabric extends IndustrialBuilding {
    //1.6 Создать класс фабрика.
    // Вопрос: От какого класса должна наследоваться Фабрика.
    // Поля, которые можно определить в Фабрике: количество работников, выпускаемая продукция (запчасти, полиэтилен и т.д.)
    private int numOfEmpl;
    private String product;

    public Fabric(String street, String wall, int year, String industry, int numOfEmpl, String product) {
        super(street, wall, year, industry);
        this.numOfEmpl = numOfEmpl;
        this.product = product;
    }
}
