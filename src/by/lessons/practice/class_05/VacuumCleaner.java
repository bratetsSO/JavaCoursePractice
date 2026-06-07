package by.lessons.practice.class_05;

public class VacuumCleaner implements ElectricalDevice{
    //6. Создать класс Пылесос.
    // Поля наименование, бренд, стоимость, Boolean isOn.
    // Класс Пылесос имплементирует интерфейс Электроприборы.
    // Переопределите метод ворк так, чтобы метод выводил «Пылесос убирает».
    private String name;
    private String brend;
    private double price;
    private boolean isOn;

    public VacuumCleaner(String name, String brend, double price, boolean isOn) {
        this.name = name;
        this.brend = brend;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Пылесос пылесосит");
    }

    public void Cleaning(){
        System.out.println("Пылесосит");
    }
}
