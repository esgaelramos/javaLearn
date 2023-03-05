public class X3UpdatingVariables {
   public static void main(String[] args) {
      // Updating int variables 
      int salary = 1000;

      // bonus 200
      salary = salary + 200;
      System.out.println(salary);

      // pension 50
      salary = salary - 50;
      System.out.println(salary);

      // 2 hour extra 30
      // cost food 45
      salary = salary + (30 * 2) - 45;

      // Updated String variables
      String employeeName = "Anahí Salgado";
      employeeName = employeeName + " Díaz de la Vega";
      System.out.println(employeeName);

      employeeName = "Irene " + employeeName;
      System.out.println("Your name is: " + employeeName);
   } 
}
