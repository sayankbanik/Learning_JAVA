import java.util.*;
public class Triangle
{
	public static void main(String[] args) 
    {
		// write your code logic here !! 
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		if((x+y)>z && (x+z)>y && (y+z)>x ){
			//System.out.println("valid");
			if((x == y) && (x==z) && (y== z))
				System.out.println("Equilateral Triangle");
			else if((x==y) || (y==z) ||(z==x) )
				System.out.println("Isosceles Triangle");
			else if((x != y) && (x!=z) && (y!= z))
				System.out.println("Scalene Triangle");
		}
		else{
			System.out.println("Not a Triangle");
		}


        sc.close();
        
	}
}