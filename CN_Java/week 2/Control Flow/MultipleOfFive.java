import java.util.Scanner;

public class MultipleOfFive {
    public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 if(num%5==0)
		 	System.out.println("Multiple of 5");
		else
			System.out.println("Not a Multiple of 5");
	
            sc.close();
        }
    
}
