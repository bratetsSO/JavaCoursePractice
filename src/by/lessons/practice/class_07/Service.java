package by.lessons.practice.class_07;

import java.util.ArrayList;
import java.util.List;

public class Service {
    //4. Создать класс сервис.
    // Реализовать в этом классе метод аутенфикации  пользователя
    // (void authenticate (String login, String password).
    // Этот метод должен проверять наличие пользователя в репозитории по логину.
    // Если пользователя нет, то выбрасываем собственное исключение (UserNotFoundException)
    public void authenticate(String login, String password) {
        List<User> users = UserRepository.users;
        List<String> logins = new ArrayList<>();
        for (User user : users) {
            logins.add(user.getLogin());
        }
        if(!logins.contains(login)) {
            throw new UserNotFoundException("Error");
        }
    }
}
