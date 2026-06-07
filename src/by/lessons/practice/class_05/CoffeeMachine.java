package by.lessons.practice.class_05;

public class CoffeeMachine implements ElectricalDevice {
    //3. Создать класс Кофемашина.
    // Поля наименование. Список функционала. Стоимость, Boolean isOn (включен)
    // Класс кофемашина имплементирует интерфейс Электроприборы.
    // Переопределите метод ворк так, чтобы методы выводил «Кофемашина варит кофе».
    private String name;
    private String functions;
    private double price;
    private boolean isOn;

    public CoffeeMachine(String name, String functions, double price, boolean isOn) {
        this.name = name;
        this.functions = functions;
        this.price = price;
        this.isOn = isOn;
    }

    public void work() {
        System.out.println("Кофемашина варит кофе");
    }

    public void switchOff() {
        if (isOn) {
            this.isOn = false;
            System.out.println("Кофемашина выключена");
            return;
        }
        System.out.println("Кофемашина уже выключена");
    }

    @Override
    public void start() {
        this.isOn = true;
        System.out.println("Кофемашина включена");
    }
}
