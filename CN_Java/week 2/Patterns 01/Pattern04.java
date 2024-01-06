//package CN_Java.week 2.Patterns 01;
import java.util.*;

public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1;i<=n;i++){
            for(int j=n;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // 
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                //as the J is increasing N os getting decreased ; n-j+1
                System.out.print((n+1)-j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
