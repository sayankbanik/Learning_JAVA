import java.util.*;
public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int gap =sc.nextInt();
        int celcius;
        for(int i=start; i<=end; i=i+gap){
            celcius = ((i-32)*5)/9;
            System.out.println(i+" "+celcius);
        }
        sc.close();
    }
}
