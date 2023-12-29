import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args)
{
     // write your code here
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();

      int greatest = (a > b)&&(a > c)?a : (b>c)? b :c;

      System.out.println(greatest);

      scan.close();
         }
}
