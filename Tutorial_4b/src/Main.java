import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //create color arrList
        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("Red", "Green", "Black", "White", "Pink")
        );

        //Before swap
        System.out.println(list);

       int indexA = 0;
       int indexB = 2;
       Collections.swap(list, indexA, indexB);

       //Afterswap
        System.out.println(list);
    }
}