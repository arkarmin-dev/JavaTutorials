//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arrnum={3,4,5,7,9};

        //Sum the numbers

        int sum = 0;
        for(int num: arrnum) {
            sum += num;
        }

        //Calculate the average
        double average = (double) sum/arrnum.length;
        System.out.println("The average is " + average);

    }
}