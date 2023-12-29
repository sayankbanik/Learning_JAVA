import java.util.Scanner;

public class Salary {

     public static void main(String[] args) {
        //Write your code here. 
        Scanner sc = new Scanner(System.in);

        int basic = sc.nextInt();
        char grade=sc.next().charAt(0);

        double hra = 0.20 * basic;
        double da = 0.50 * basic;
        double pf = 0.11 * basic;
        double allow;
        
        switch(grade){
            case 'A' : allow = 1700;
            break;
            case 'B' : allow = 1500;
            break;
            case 'C' : allow = 1300;
            break;
            default : allow = 1300;
            break;
        }

        double totalSalary = basic + hra + da + allow - pf;
        System.out.println(Math.round(totalSalary));

        sc.close();
    }
    
}
