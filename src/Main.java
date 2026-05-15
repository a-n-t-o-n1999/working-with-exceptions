public class Main {

    public static void errorСhecking(String login, String password, String confirmPassword) {
        if (!login.matches("\\w*") || login.length() > 20) {
            throw new WrongLoginException();
        }

        if (!password.matches("\\w*") || password.length() > 20 || password != confirmPassword) {
            throw new WrongPasswordException();
        }
    }


    public static void main(String[] args) {
        System.out.println("Проверка");
        try {
            errorСhecking("qwe", "qwe", "qwe");
        } catch (WrongLoginException | WrongPasswordException q) {
            System.out.println("Что-то пошло не так");
        }
    }

}
