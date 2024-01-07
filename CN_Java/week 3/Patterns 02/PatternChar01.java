//package Patterns 02;
import java.util.*;
public class PatternChar01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();

        // pattern 01
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                char jthChar = (char)('A'+j-1) ;
                System.out.print(jthChar+" ");
            }
            System.out.println();
        }
        System.out.println();

        // pattern 02
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                char ithChar = (char)+('A'+i-1);
                System.out.print(ithChar+" ");
            }
            System.out.println();
        }
        System.out.println();

        // pattern 03
        for(int i=1;i<=N;i++){
            int temp = i;
            for(int j=1;j<=N;j++){
                char jthChar = (char)('A'+temp-1);
                System.out.print(jthChar + " ");
                temp++;
            }
            System.out.println();
        }
        System.out.println();
        
        // pattern 03 another approach
        for(int i=1;i<=N;i++){
            //int temp = i;
            char p = (char)('A'+i-1);
            for(int j=1;j<=N;j++){
                //char jthChar = (char)('A'+temp-1);
                System.out.print(p + " ");
                p = (char)(p + 1);
            }
            System.out.println();
        }
        System.out.println();
        
        // PATTERN 04
        for(int i=1;i<=N;i++){
            int temp = N - i + 1;
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
        System.out.println();

        //pattern 05
        for(int i=1;i<=N;i++){
            char p = (char)('A'+N-i);
            for(int j=1;j<=i;j++){
                System.out.print(p+" ");
                p = (char)(p + 1);
            }
            System.out.println();
        }
        System.out.println();

        // pattern 06
        for(int i=1;i<=N;i++){
            for(int j=1; j<=N-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //
        for(int i=1;i<=N;i++){
            for(int j=1; j<=N-i+1;j++){
                System.out.print(N-i+1+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        //
        for(int i=1;i<=N;i++){
            //print spaces
            for(int k=1;k<=N-i;k++){
                System.out.print("  ");
            }
            //print starts
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
