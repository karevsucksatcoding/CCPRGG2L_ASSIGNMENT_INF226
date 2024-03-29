import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);
    static final int targetWeight = 150;

    public static void main(String[] args) throws Exception {

        System.out.print("Enter current weight in lbs: ");
        int weight = scan.nextInt();

        if (weight > 150) {
            loseWeight(weight);
        } else {
            System.out.println("Current weight must be greater than 150 lbs!");
        }
        scan.close();
    }

    static void loseWeight(int currentWeight) {

        System.out.println("Eating right!");
        System.out.println("Doing exercises!");

        currentWeight = checkWeight(currentWeight);

        if (currentWeight > 150) {
            fixDietandExercise(currentWeight);
        }
           
    }

    static int checkWeight(int weight) {
        System.out.println("My current weight is: " + weight + "lbs");
        return weight;
    }

    static int fixDietandExercise(int weight) {

        System.out.println("Fixing Diet and Exercise!");
        System.out.print("Enter weight lost in lbs: ");
        int weightlost = scan.nextInt();

        int currentWeight = weight - weightlost;
        if (currentWeight==150) {
            System.out.println("I have reached my target weight ("+ currentWeight +"lbs)!");
        }
        else if (currentWeight > 150) {
            System.out.println("Still not enough! " + (currentWeight - 150) + "lb/s more to burn!");
            fixDietandExercise(currentWeight);
        }
        else {
            System.out.println("You went below your target weight (" + currentWeight + "lbs)!");
        }
        
        
        return currentWeight;
     

    }
}
