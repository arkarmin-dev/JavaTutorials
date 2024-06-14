import java.util.Scanner;
import java.util.regex.Pattern;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Scanner for user password
        Scanner scn = new Scanner(System.in);

        //Ask password from user
        System.out.println("Enter your password: ");
        String pw = scn.nextLine();

        //Check password
        if (isStrongPassword(pw)) {
            System.out.println("The password is strong");
        }else {
            System.out.println("The password is not strong enough");
        }

        scn.close();
    }

    //Condition Method
    public static boolean isStrongPassword(String pw) {
        if(pw.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;

        for(char c : pw.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (isSpecialChar(c)) {
                hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasSpecialChar;
    }
    private static boolean isSpecialChar(char c) {
        String specialChars = "!@#$%^&*()_+";
        return  specialChars.indexOf(c) != -1;
    }
}