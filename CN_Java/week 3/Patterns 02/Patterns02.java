//package Patterns 02;
import java.util.*;
public class Patterns02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print("  ");
            }
            int temp = i-1;
            for(int j=1;j<=2*i-1;j++){
                if(j>i){
                    temp--;
                    System.out.print(temp+" ");
                }
                else{
                temp++;
                System.out.print(temp+" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            int p =i-1;
            for(int j=1;j<=i-1;j++){
                System.out.print(p+" ");
                p--;
            }
            System.out.println();
        }
        System.out.println();

        // hourglass pattern
        for(int i=1;i<=N;i++){
            //print spaces
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            //print the numbers
            int temp = i;
            for(int j=1;j<=N-i+1;j++){
                System.out.print(temp+"   ");
                temp++;
            }
            System.out.println();
        }
        for(int i=1;i<=N-1;i++){
            //print spaces
            for(int j=1;j<=N-1-i;j++){
                System.out.print("  ");
            }
            //print numbers
            int a = N - i;
            for(int j=1;j<=i+1;j++){
                System.out.print(a+"   ");
                a++;
            }
            System.out.println();
        }
        System.out.println();

        // diamond pattern
        int p = (N/2)+1;
        int q = N-p;

        for(int i=1;i<=p;i++){
            //print spaces
            for(int j=1;j<=p-i;j++){
                System.out.print("  ");
            }
            //print stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=q;i++){
            //print spaces
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            //print starts
            for(int j=1;j<=N-2*i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
        }
    
}
