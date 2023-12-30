import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.print("Enter the Range: ");
        int range = sc.nextInt();
        int result;

        for(int i=1;i<=range;i++){
            result = num * i;
            System.out.println(num+" X "+i+" = "+result);
        }

        sc.close();
    }
}
