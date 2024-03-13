
import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your housing expense: ");

        int houseExpense = input.nextInt();
        System.out.println();

        System.out.println("Enter your food expense: ");
        int foodExpense = input.nextInt();
        System.out.println();

        System.out.println("Enter your clothing expense: ");
        int clothExpense = input.nextInt();
        System.out.println();

        System.out.println("Enter your Transport Expense: ");
        int transExpense = input.nextInt();
        System.out.println();

        System.out.println("Enter your education expense: ");
        int educationExpense = input.nextInt();
        System.out.println();

        System.out.println("Enter your healthcare expense: ");
        int healthExpense = input.nextInt();
        System.out.println();

        System.out.println("Enter your Vacation expense: ");
        int vacationExpense = input.nextInt();


        Expense expenditure = new Expense(houseExpense, foodExpense,clothExpense,transExpense,educationExpense,healthExpense,vacationExpense);

        System.out.printf("This is your FairTax: %n%d ", expenditure.calculateFairTax());

    }
}
