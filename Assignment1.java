import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.println("National University email and phone validator");
        System.out.println("=================================================");
        System.out.print("Enter student email address: ");
        String studentEmail = scan.nextLine();
        System.out.println("=================================================");
        System.out.println("Thank you.");
        System.out.println("=================================================");
        System.out.print("Enter student phone number: ");
        String studentNum = scan.nextLine();
        System.out.println("=================================================");
        System.out.println("Thank you.");
        System.out.println("=================================================");
        System.out.print("Enter student birthday (yyyy/mm/dd): ");
        String studentbday = scan.nextLine();
        System.out.println("=================================================");



        Pattern pattern = Pattern.compile("[\\w]+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEmail);
        Pattern patternnum = Pattern.compile("\\+63+\\d{10}");
        Matcher matchernum = patternnum.matcher(studentNum);
        Pattern patternbday = Pattern.compile("\\d{4}/\\d{2}/\\d{2}");
        Matcher matcherbday = patternbday.matcher(studentbday);


        boolean match = matcher.matches();
        boolean matchnum = matchernum.matches();
        boolean matchbday = matcherbday.matches();

        match = Pattern.matches("[\\w]+@students.national-u.edu.ph", studentEmail);
        matchnum = Pattern.matches("\\+63+\\d{10}", studentNum);
        matchbday = Pattern.matches("\\d{4}/\\d{2}/\\d{2}", studentbday);

        if (match) {
            System.out.println("Email address: Valid");
        } else {
            System.out.println("Email address: Invalid");
        }
        if (matchnum) {
            System.out.println("Phone number: Valid");
        } else {
            System.out.println("Phone number: Invalid");
        }
        if (matchbday) {
            System.out.println("Birthday: Valid");
        } else {
            System.out.println("Birthday: Invalid");
        }

    }
}
