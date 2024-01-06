public class Binary2Decimal {
    
    public static void main(String[] args) {
        // Write your code here
        //System.out.println("Welcome to Coding Ninjas Studio Online Compiler!!");
        int N =1100;
        int count=0, sum=0;
        int rem;
        while(N >0){
            rem = N % 10;
            
            sum = sum + (rem *(int) Math.pow(2, count));
            count++;
            N =N/10;
        }
        System.out.println(sum);
    }
    
}
