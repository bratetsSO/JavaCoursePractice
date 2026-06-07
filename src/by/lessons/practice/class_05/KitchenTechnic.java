package by.lessons.practice.class_05;

public interface KitchenTechnic {

    default void cooking(){
        System.out.println("Техника готовит");
    }

    void work();
}
