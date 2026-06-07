package by.lessons.practice.class_05;

public class Main {
    public static void main(String[] args) {
        //7. В классе main cоздайте по паре объектов на основании вышесозданных классов.
        // Создайте в классе main создайте выставку из электроприбров и продемонстрируйте способности каждого электроприбора
        CoffeeMachine coffeeMachine1 = new CoffeeMachine("LG","варит",123.45,true);
        CoffeeMachine coffeeMachine2 = new CoffeeMachine("Delongi","латте", 120, true);
        Fridge fridge = new Fridge("Atlant-1","Atlant",200,true);
        WashingMachine washingMachine = new WashingMachine("I-2","Indezit",111, true);
        VacuumCleaner vacuumCleaner = new VacuumCleaner("S-4","Samsung",125, true);

        //7. В классе main cоздайте по паре объектов на основании вышесозданных классов.
        // Создайте в классе main создайте выставку из электроприбров и продемонстрируйте способности каждого электроприбора
        ElectricalDevice[] electricalDevices = {coffeeMachine1, coffeeMachine2, fridge, washingMachine, vacuumCleaner};
        for (ElectricalDevice x:electricalDevices){
            x.work();
        }
        System.out.println("----------------------------------");
        //9.  В классе main сделать выставку только из Кухонной техники.
        // Продемонстрировать спосбоности всех электроприборов в этой выставке.
        KitchenTechnic[] kitchenTechnics = {fridge,washingMachine};
        for (KitchenTechnic k: kitchenTechnics){
            k.work();
            k.cooking();
        }
        System.out.println("----------------------------------");
        coffeeMachine1.start();
    }
}
