import java.util.Scanner;
    import java.time.LocalDate;
       import java.text.ParseException;
public class agecalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("enter your yearofbirth:");
        int yearofbirth = inputScanner.nextInt();
        int currentyear = LocalDate.now().getYear();
        int age = currentyear-yearofbirth;
        System.out.println("your age is:"+age);
// comment
System.out.println("enter your yearofbirth:");
String dateofbirth = inputScanner.nextLine();
LocalDate birthdate = LocalDate.parse(dateofbirth);
int yearofBirth = birthdate.getYear();
int currentYear = LocalDate.now().getYear();
    }
}