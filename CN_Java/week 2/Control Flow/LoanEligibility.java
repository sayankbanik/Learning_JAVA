import java.util.Scanner;

public class LoanEligibility {
        public static void main(String[] args) {
       // write your code logic ...
       Scanner sc = new Scanner(System.in);

       int age = sc.nextInt();
       double monthlyIncome = sc.nextDouble();
       boolean hasOutstandingLoan = sc.nextBoolean();

       if((age>=18) && (monthlyIncome >= 2000) && (hasOutstandingLoan == false))
            System.out.println("You are eligible for the loan.");
        else
            System.out.println("You are not eligible for the loan.");

            sc.close();
       
    }
}
