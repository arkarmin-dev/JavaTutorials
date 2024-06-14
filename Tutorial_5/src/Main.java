import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner for user input
        Scanner scn = new Scanner(System.in);

        //Random PC
        Random random = new Random();
        int pc = random.nextInt(3);

        //user's choice
        System.out.println("Choose: 0:Rock 1:Paper, 2:Scissors: ");
        int userChoice = scn.nextInt();

        //Display
        System.out.println("PC: " + choiceToString(pc));
        System.out.println("User: " + choiceToString(userChoice));

        //Determine

         if (userChoice == 0 && pc ==2 || userChoice == 2 && pc == 1 || userChoice == 1 && pc == 0) {
             System.out.println("User wins!");
        }
         else if (userChoice == pc) {
             System.out.println("Draw!");
         }
         else {
           System.out.println("PC wins!");
         }
        scn.close();
    }

    //convert num to string

    public static String choiceToString (int choice) {
        switch (choice) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }
}