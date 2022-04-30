import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class ageCalculator {
    public static void main(String[] args) throws Exception {
        System.out.println(" Please Enter your Birth Date in form : yyyy-mm-dd in numbers.");
        Scanner scanner= new Scanner(System.in);
        String input = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(input);    //converting the string to a local date format.

        LocalDate today = LocalDate.now();
        //LocalDate birthDate = LocalDate.of(1999,05,28);
        int age = Period.between(birthDate,today).getYears();

       // if ((birthDate != null) && (today != null))


        System.out.println("You are : " + age + " year(s) old.");

    }
}
