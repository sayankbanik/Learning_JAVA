/* *****************************************************************************
 *  Name:              Sayan Kansabanik
 *  Last modified:     December 29, 2023 : 20:10 
 **************************************************************************** */
import java.util.Scanner;
 public class Scholarship {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks obtained in Scholarship Exam: ");
        double score = sc.nextDouble();

        if(score >=65){
            System.out.println("Congratulations! You have passed the Scholarship Examination.");
            System.out.print("Enter the GPA: ");
            float gpa = sc.nextFloat();
            System.out.print("\nEnter the Sport Stars: ");
            int sportStars = sc.nextInt();
            if(gpa >=3.5 || sportStars>=3){
                System.out.println("Congratulations! Eligible for Scholarship.");
            }
            else{
                System.out.println("Sorry! Not Eligible for Scholarship.");
            }
        }
        else{
            System.out.println("Sorry! You didn't pass.");
        }
// another approach
        
            System.out.print("Enter the GPA: ");
            float gpa = sc.nextFloat();
            System.out.print("\nEnter the Sport Stars: ");
            int sportStars = sc.nextInt();
            //short circuit evaluation
            if(score >=65 &&  (gpa >=3.5 || sportStars>=3)){
                System.out.println("Congratulations! Eligible for Scholarship.");
            }
            else{
                System.out.println("Sorry! Not Eligible for Scholarship.");
            }

        sc.close();
    }
    
}
