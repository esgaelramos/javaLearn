public class X4NamingJava { // UpperCamelCase
    public static void main(String[] args) {
        int celphone = 55551;
        int celPhone = 55552; // camelCase
        System.out.println(celphone);
        System.out.println(celPhone);
     
        String $countryName = "Spain";
        String _backgroundColor = "Green";

        String currency$ = "MXN";
        String background_color = "Blue";
        
        System.out.println($countryName);
        System.out.println(_backgroundColor);
        System.out.println(currency$);
        System.out.println(background_color);

        int POSITION = -5; // Constantes
        int MAX_WIDTH = 9999;
        int MIN_WIDTH = 1;
        System.out.println(POSITION);
        System.out.println(MAX_WIDTH);
        System.out.println(MIN_WIDTH);

        // LowerCamelCase
        String fullName = "Irene Anahí Salgado";
        int sizeInCentimeters = 26;
        System.out.println(fullName);
        System.out.println(sizeInCentimeters);
    }
}
