/* *****************************************************************************
 *  Name:              Sayan Kansabanik
 *  Problem:            Check the input integer is positive or negative
 *  Last modified:     December 29, 2023 : 19:47
 **************************************************************************** */
import java.util.Scanner;
public class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Input is Positive");
        }
        else if(num<0){
            System.out.println("Input is Negative");
        }
        else{
            System.out.println("Input is Zero");
        }
        sc.close();

    }
    
}
