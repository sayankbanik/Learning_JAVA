//package CN_Java.week 2.Loops;

public class demo {
    public static void main(String[] args) {
        System.out.println("Hello");

        // int i = 10;
        // System.out.println(i); //10
        // System.out.println(i++); // 10
        // System.out.println(i); // 11
        // System.out.println(++i); //12
        // System.out.println(i); //12
        //for loop
        for(int i=1; i<=10;i++) {
            System.out.println(i);
        }
        int i=0;
        for(;;)
        {
            if(i == 11)
                break;
            System.out.print(i);
            i++;
            break;
          
        }
    }
    
}
