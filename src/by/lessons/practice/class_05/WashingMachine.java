package by.lessons.practice.class_05;

public class WashingMachine implements ElectricalDevice, KitchenTechnic {
    //5. Создать класс Стиральная машина.
    // Поля наименование, бренд, стоимость, Boolean isOn.
    // Класс стиральная машина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Стиральная машина стирает».
    private String name;
    private String brend;
    private double price;
    private boolean isOn;

    public WashingMachine(String name, String brend, double price, boolean isOn) {
        this.name = name;
        this.brend = brend;
        this.price = price;
        this.isOn = isOn;
    }

    public void work(){
        System.out.println("Стиральная машина стирает");
    }

    @Override
    public void cooking() {
        System.out.println("Стиралка моет");
    }
}
