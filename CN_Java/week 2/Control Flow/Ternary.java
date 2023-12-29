import java.util.Scanner;
public class Ternary {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        // ternary operator
        int greater = num1 > num2 ? num1 : num2;

        System.out.println(greater + " is greater");

        //gretest of 3 numbers
        int greatest = (num1 > num2)&&(num1 > num3)?num1 : (num2>num3)? num2 :num3;

        System.out.println(greatest + " is greatest");
        // if(num1>num2){
        //     int greater = num1;
        //     System.out.println(greater + "is greater");
        // }    
        // else{
        //     int greater = num2;
        //     System.out.println(greater + " is greater");
        // }
            
            sc.close();
    }
}
