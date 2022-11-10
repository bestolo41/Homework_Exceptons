public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String login = "aswded2526ndfh_drt";
        String password = "dgdshh_dfhs";
        String confirmPassword = "dgdshh_dfhs";

        Data.checkLoginAndPassword(login, password, confirmPassword);
    }
}