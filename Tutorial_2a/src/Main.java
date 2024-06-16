import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input number
        System.out.println("Insert a number");
        int num = scanner.nextInt();
        scanner.nextLine();

        String result;
        result = (num > 0) ? "positive" : "not positive";
        System.out.print("Number is " + result);
    }

}