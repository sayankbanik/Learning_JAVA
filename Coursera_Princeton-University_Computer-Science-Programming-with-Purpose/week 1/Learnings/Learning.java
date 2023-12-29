
class Learning {
    public static void main(String[] args) {
        
        System.out.println("Hello World");

        // abs()
        /*
         * To find a number's absolute value, Java's Math class has the abs() function. 
         * The abs() function accepts an integer data type parameter and returns the value's positive value.
         */
        System.out.println(-45.369899);
        System.out.println(Math.abs(-45.369899));

        /*
         * Math.round() Returns the closest long to the argument, with ties rounding to positive infinity.
         * return long for double
         * returns int for float
         * https://stackoverflow.com/questions/2654839/rounding-a-double-to-turn-it-into-an-int-java
         */
        double db = 456.369878;
        System.out.println(Math.round(db));  //456 long
        float bd = 456.968749f;
        System.out.println(Math.round(bd)); //457 int

        /*
         * String a = "Java";
         *  a.getClass().getName() -to know a variable type of java
         */

        /*
         * trigonometric functions in java
         * https://www.geeksforgeeks.org/java-math-sin-method-examples/
         */

         /*
          * Math.asin(radian)
          * Math.sqrt(number)
          * Math.pow(number, power)
          * Math.sin(radian)
          * Math.cos(radian)
          https://www.edureka.co/blog/java-sqrt-method/
          https://www.geeksforgeeks.org/java-math-asin-method-example/
          */

          /*
           * command line arguments
           * https://www.javatpoint.com/command-line-argument
           * https://www.geeksforgeeks.org/command-line-arguments-in-java/
           */

           /*
            * https://en.wikipedia.org/wiki/Haversine_formula
            */
    }
    
}
