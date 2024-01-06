import java.util.Scanner;
public class DemoWhile {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //System.out.println(num);
        int res, sum=0;
        while(num > 0){
            res = num % 10;
            //System.out.println(res+";;;");
            if(res != 0 || res !=1){
                for(int i=2;i<=res;i++){
                    if(res==2)
                        System.out.println(res);
                    else if((res%i != 0)){
                        System.out.println(res);
                        // non-prime
                        break;
                    }
                    // else{
                    //     System.out.println(res);
                    //     break;
                    // }
                    sum=sum+res;
                }

            }
            num=num/10;
        }
        // int i = 0;
        // int start = 0, sum =0;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }
        System.out.println(sum);

        sc.close();
    }
}
