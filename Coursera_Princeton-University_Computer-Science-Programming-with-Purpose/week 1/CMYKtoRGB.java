/* *****************************************************************************
 *  Name:              Sayan Kansabanik
 *  Coursera User ID:  
 *  Last modified:     December 29, 2023
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        double white = 1 - black;
        double red = 255 * white * (1 - cyan);
        double green = 255 * white * (1 - magenta);
        double blue = 255 * white * (1 - yellow);

        System.out.println("red    = " + (int) Math.round(red));
        System.out.println("green  = " + (int) Math.round(green));
        System.out.println("blue   = " + (int) Math.round(blue));

    }
}
