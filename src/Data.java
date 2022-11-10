import java.util.regex.Pattern;

public class Data {
    public static void checkLoginAndPassword(String login,
                                                String password,
                                                String confirmPassword) throws WrongLoginException, WrongPasswordException {
            if (Pattern.matches("[0-9a-zA-Z\\_]{1,20}", login));
            else if (login.length() > 20 || login.length() < 1) throw new WrongLoginException("Некорректная длина логина");
            else throw new WrongLoginException("Использованы недопустимые символы");

        if (Pattern.matches("[0-9a-zA-Z\\_]{1,20}", password)) {
            if (password.equals(confirmPassword));
            else throw new WrongPasswordException("Пароли не совпадают");
        } else if (password.length() > 20 || password.length() < 1) throw new WrongPasswordException("Некорректная длина пароля");
                else throw new WrongPasswordException("Использованы недопустимые символы");
        System.out.println(true);
    }
}
