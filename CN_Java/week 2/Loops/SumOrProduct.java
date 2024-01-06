import java.util.Scanner;
public class SumOrProduct {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // Enter the range
        int N = sc.nextInt();
        // Enter the choice ( 1 for Sum | 2 for product)
        int C = sc.nextInt();
        int sum = 0;
        int prod = 1;

//approach : 1
        //logic for Sum
        if(C == 1){
            for(int i=1;i<=N;i++){
                sum = sum +i;
                }
            System.out.println(sum);            
        }
        //logic for Product
        else if(C==2){
            for(int i=1;i<=N;i++){
                prod = prod * i;
            }
            System.out.println(prod);
        }
        else{
            System.out.println(-1);
        }
//approach : 2
        switch(C){
            case 1:        
                for(int i=1;i<=N;i++){
                    sum = sum +i;
                }
                System.out.println(sum);            
            break;
            case 2: 
            for(int i=1;i<=N;i++){
                prod = prod * i;
            }
            System.out.println(prod);
            break;
            default: System.out.println(-1);
            break;
        }
        sc.close();
    }
    
}
