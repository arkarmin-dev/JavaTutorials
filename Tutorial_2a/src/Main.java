import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input number
        System.out.println("Insert a number");
        int num = scanner.nextInt();
        scanner.nextLine();
        if(num > 0){
            System.out.print("Number is positive");
        }else{
            System.out.print("Number is negative");
        }

    }
}