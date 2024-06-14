import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //user input
        System.out.print("Insert the printing year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        //condition
        if(year%4 == 0 || year%100 == 0 || year%400 == 0) {
            System.out.println("It is a leap year.");
        }else {
            System.out.println("It is not a leap year.");
        }
    }
}