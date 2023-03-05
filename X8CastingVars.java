public class X8CastingVars {
    public static void main(String [] args) {
        
        // in a year put 30 doggies in a house
        // how many dogs put in a month?

        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs); // 2.5

        // ESTIMATION VALUE
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs); // 2 //SE TRUNCA!!!

        // EXACT VALUE
        int a = 30;
        int b = 12;
        System.out.println(a / b); // 2 /TRUNCATED
        System.out.println((double) a / (double) b); // 2.5 /WITH CASTING

    }
}
