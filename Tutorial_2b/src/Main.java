import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //input numbers
        System.out.print("Input the 1st number: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Input the 2nd number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Input the 3rd number: ");
        int num3 = scanner.nextInt();
        scanner.nextLine();

        //condition
        int a;
        int b;
        if(num1 > num2) {
            a = num1;
        }else {
            a = num2;
        }
        if(num2 > num3) {
            b = num2;
        }else{
            b = num3;
        }
        if( a > b){
            System.out.println("The greatest: " + a);
        }else{
            System.out.println("The greatest: " + b);
        }
    }
}