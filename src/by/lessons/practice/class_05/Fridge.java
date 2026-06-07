package by.lessons.practice.class_05;

public class Fridge implements ElectricalDevice, KitchenTechnic {
    //4. Создать класс Холодильник. Поля: наименование, марка, стоимость, Boolean isOn (включен).
    // Класс холодильник имплементирует интерфейс Электроприборы. Переопределите метод work так, чтобы методы выводил «Холодильник морозит».
    private String name;
    private String marka;
    private double price;
    private boolean isOn;

    public Fridge(String name, String marka, double price, boolean isOn) {
        this.name = name;
        this.marka = marka;
        this.price = price;
        this.isOn = isOn;
    }

    public void work(){
        System.out.println("Холодильник морозит");
    }

    @Override
    public void cooking() {
        System.out.println("Готовит лед");
    }
}
