import java.util.Scanner;

public class exercise2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        school("Toyota Vios");
        scan.close();
    }

    static void school(String drive) {

        System.out.println("Starting Engine...");
        start(drive);

        String feedback = getFeedBack(drive);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            learnSkill(drive);

            // Recursive call
            school(drive);
        } else if (feedback.equals("yes")) {
            stop(drive);
        }
    }

    static void start(String drive) {
        System.out.println("Accelerating...");
    }

    static String getFeedBack(String drive) {
        System.out.print("Have you finished driving " + drive +"? (Enter \"yes\" or \"no\"): ");

        String feedback = scan.next();

        return feedback;
    }

    static void learnSkill(String food) {
        System.out.print("Enter skill you want to learn:");
        String skill = scan.next();
        System.out.println("Browsing the Manual.... Added " + skill);
    }

    static void stop(String drive) {
        System.out.println("Leaving " + drive);
    }

}