import java.util.Scanner;

public class Task0202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean passwordOK = false;
        do {
            try {
                System.out.println("Enter password: ");
                String password = scanner.nextLine();
                check(password);
                passwordOK = true;
            } catch (MyException ex) {
                System.out.println(ex.getMessage());


            }
        } while (!passwordOK);
        scanner.close();
        System.out.println("Password is valid");
    }

    public static void check(String line) throws MyException {
        if (line.length() < 8) {
            throw new MyException("Password must be longer than 8 symbols");
        }
        if (!line.matches(".*[A-Z].*")) {
            throw new MyException("There aren't any Capital letters");
        }
        if (!line.matches(".*\\d.*")) {
            throw new MyException("There aren't any digits");
        }
        if (!line.matches(".*[!@#$%^&*].*")) {
            throw new MyException("There aren't any symbols");
        }
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}