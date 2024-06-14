
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> programmingLanguages = new ArrayList<>(
                Arrays.asList("Python", "JAVA", "PHP", "Perl", "C#")
        );

        System.out.println(programmingLanguages);

        String[] languagesArr = new String[programmingLanguages.size()];
        languagesArr = programmingLanguages.toArray(languagesArr);

        System.out.println(languagesArr);
        System.out.println("Array:");
        for(String language: languagesArr){
            System.out.println((language));
        }
    }
}