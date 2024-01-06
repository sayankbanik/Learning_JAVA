//package CN_Java.week 2.Patterns 01;
import java.util.*;
public class PatternOne {
    public static void main(String[] args) {
         // square pattern
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i <=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
