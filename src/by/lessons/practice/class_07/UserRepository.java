package by.lessons.practice.class_07;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    //2. Создать класс UserRepository.
    // Внутри класса создать статическую переменную List<User> users.
    static List<User> users;

    //3. Выполнить инициаизацию коллекции в статическом блоке.
    // Создать 5 пользователей и заполнить поля.
    static {
        users = new ArrayList<>();
        users.add(new User("user01","psw123","name01","surname01"));
        users.add(new User("user02","psw123","name02","surname02"));
        users.add(new User("user03","psw123","name03","surname03"));
        users.add(new User("user04","psw123","name04","surname04"));
        users.add(new User("user05","psw123","name05","surname05"));
    }
}
