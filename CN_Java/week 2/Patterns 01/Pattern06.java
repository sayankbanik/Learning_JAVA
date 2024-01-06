import java.util.*;
public class Pattern06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            //in the iTh row
            // print spaces to n-i
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            // print starts 2i-1;
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println();
        //
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
        //
        for(int i=1;i<=n;i++){
            int temp = i;
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp--;
            }
            System.out.println();
        }
        System.out.println();
        //
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=1+n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //
        for(int i=1;i<=n;i++){
            int temp =i;
            for(int j=1;j<=n;j++){
                if(temp > n){
                    for(int k=1;k<i;k++)
                        System.out.print(k+" ");
                    break;
                }
                else{
                    System.out.print(temp+" ");
                    temp++;
                }
            }
            System.out.println();
        }
        System.out.println();
        //
        for(int i=1;i<=n;i++){
            int num = 1;
            for(int j=1;j<=n;j++){
                if(i==1 || i==n ){
                    System.out.print(j+" ");
                    
                }
                else if(j==1 || j==n){
                    System.out.print(num+" ");
                    num++;
                }
                else{
                    System.out.print("  ");
                }
                    
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
    
}
