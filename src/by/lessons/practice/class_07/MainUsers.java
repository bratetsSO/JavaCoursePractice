package by.lessons.practice.class_07;

import static by.lessons.practice.class_07.UserRepository.users;

public class MainUsers {
    public static void main(String[] args) {
        //5. В этом же методе выполнить проверку пароля пользователя,
        // если по логину мы его нашли. Если пароль не совпадает,
        // то выбрасываем собственное исключение NotCorrectPasswordException.
        Service service = new Service();
        service.authenticate("user00","1232");
    }
}
