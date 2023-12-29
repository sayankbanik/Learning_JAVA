/* *****************************************************************************
 *  Name:              Sayan Kansabanik
 *  Last modified:     December 29, 2023 : 19:47
 **************************************************************************** */
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        //if condition
        Scanner sc = new Scanner(System.in);

        //odd or even
        // System.out.print("Enter the Number: ");
        // int num = sc.nextInt();
        // if(num % 2 == 0){
        //     System.out.println(num + " is even number");
        // }
        // else{
        //     System.out.println(num +" is odd number");
        // }
        // sc.close();

       int score = sc.nextInt();

    //    if(score >=90){
    //     System.out.println("A+");
    //    }
    //    else if(score >=80){
    //     System.out.println("A");
    //    }
    //    else if(score>=70){
    //     System.out.println("B");
    //    }
        if(score >= 70 && score<80){
            System.out.println("B");
        }
        else if(score >= 80 && score<90){
            System.out.println("A");
        }
        else if(score >=90){
            System.out.println("A++");
        }

        /**
         * Short circuit evaluation
         * 
         * for logical AND operation if the first condition is false then
         * it does  not check whateaver the second condition (true/false)
         * output should be false.
         * 
         * same as for logical OR operation if the first condition is true
         * then it does not matter whatever the second condition (true/false)
         * output should be true.
         */

         sc.close();
    }
}
