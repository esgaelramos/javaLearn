public class X7MathOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Math module
        System.out.println(Math.PI); 
        System.out.println(Math.E); 

        // ceil = round up
        System.out.println(Math.ceil(x)); //3.0

        // floor = round down
        System.out.println(Math.floor(x)); //2.0

        // return a number elevated to a power
        System.out.println(Math.pow(x, y)); //9.261

        // return the max number
        System.out.println(Math.max(x, y)); //3.0

        // return the min number
        System.out.println(Math.min(x, y)); //2.1

        // return the square root
        System.out.println(Math.sqrt(y)); //1.7320508075688772

        // calc the area of a circle
        // pi * r^2
        System.out.println(Math.PI * Math.pow(y, 2)); //28.274333882308138

        // calc the area of a esfera
        // 4 * pi * r^2
        System.out.println(4 * Math.PI * Math.pow(y, 2)); //113.09733552923255

        // calc the volume of a esfera
        // 4/3 * pi * r^3
        System.out.println((4/3) * Math.PI * Math.pow(y, 3)); // 84.82300164692441


    }
}
