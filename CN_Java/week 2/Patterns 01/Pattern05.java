//package CN_Java.week 2.Patterns 01;
import java.util.*;
public class Pattern05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=(n-i))
                    System.out.print("  ");
                else    
                    System.out.print("* ");
            }
            System.out.println();
            
        }
        System.out.println();
        //
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
        System.out.println();
        //
        int count = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
            
        }
        System.out.println();
        //
        for(int i=1;i<=n;i++){
            int temp = i;
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
            
        }
        System.out.println();
        //
        for(int i=1;i<=n;i++){
            int temp = n;
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp--;
            }
            System.out.println();
        }
        sc.close();
    }
}
