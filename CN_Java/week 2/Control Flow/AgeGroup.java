/* *****************************************************************************
 *  Name:              Sayan Kansabanik
 *  Problem:           
 *  Last modified:     December 29, 2023 : 20:00
 **************************************************************************** */
import java.util.*;

public class AgeGroup {
    public static void main(String[] args) {
        // write your code logic here !! 
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if(age >= 65){
            System.out.println("Seniors");
        }
        else if(age >= 13 && age <=64){
            System.out.println("Adults");
        }
        else if(age>=5 && age <=12){
            System.out.println("Children");
        }
        else if(age>=0 && age <=4){
            System.out.println("Infants");
        }

        sc.close();
    }
}
