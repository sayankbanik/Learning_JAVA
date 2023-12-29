/* *****************************************************************************
 *  Name:              Sayan Kansabanik
 *  
 *  Last modified:     December 29, 2023 : 19:47
 **************************************************************************** */
import java.util.Scanner;
public class Score {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Score: ");

        int score = sc.nextInt();

        if(score>=90)
            System.out.println("Grade: A+");
        else if(score>=80 && score<90)
            System.out.println("Grade: A");
        else if(score>=70 && score <80)
            System.out.println("Grade: B+");
        else if(score>=60 && score<70)
            System.out.println("Grade: B");
        else if(score>=50 && score<60)
            System.out.println("Grade: C");
        else if(score>=40 && score<50)
            System.out.println("Grade: D");
        else
            System.out.println("FAIL");

        
            sc.close();
    }
}
