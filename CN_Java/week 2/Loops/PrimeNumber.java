import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check the given number is prime or not");
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int flag = 0; // flag is helping to mark the decision
        // boolean flag = false;
        
        // 0 and 1 are not Prime Numbers
        // change flag to 1 for Non-prime numbers
        if(num == 0 || num == 1)
            flag = 1;
        // if n is divisible by i that means n is Non-prime number
        // and set the flag value as 1
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                //System.out.println(" number is not prime");
                flag = 1;   
                break;  
            }
        }
            // else{
            //     System.out.println("number is Prime");
            // }
        //System.out.println(flag);
        if(flag == 0)
            System.out.println("is Prime Number");
        else    
            System.out.println(" is not Prime Number");
            
        sc.close();
        }

    }

