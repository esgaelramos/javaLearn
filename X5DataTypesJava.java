public class X5DataTypesJava {
    public static void main(String[] args) {

        // Integer:
        int integer = 444444444;
        // Long: with L
        long longL = 888888888888L; 
        // Double:
        double doublen = 123.456123456;
        // Float with F
        float floatF = 123.456F;
        System.out.println(integer);
        System.out.println(longL);
        System.out.println(doublen);
        System.out.println(floatF);


        // Tipos de datos primitivos
        // byte, short, int, long, float, double, boolean, char
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 1.23456789F;
        double d = 1.23456789;
        // boolean 
        boolean bo = true;
        // char
        char c = 'A';
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bo);
        System.out.println(c);


        // DATA INFERENCE

        // or use only var since Java 10
        // I prefer to use the type of data
        // but is possible to use var
        var salary = 1000;//int
        // pesion is 3% of salary
        var pension = salary * 0.03;//double
        System.out.println(salary);
        System.out.println(pension);
        var totalSalary = salary - pension;
        System.out.println(totalSalary);//double

        var employeeName = "Anahí Salgado";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}
