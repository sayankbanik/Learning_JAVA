import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of First n Natural numbers");
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of first "+n+" Natural number: "+sum);

        sc.close();
    }
    
}
