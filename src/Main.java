//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) {

         Car informationCar = new Car();

         informationCar.setMarka("Volkswagen");
         informationCar.setModel("T-Roc");
         informationCar.setYear(2025);

       System.out.println("Marka: " + informationCar.getMarka());
       System.out.println("Model: " + informationCar.getModel());
       System.out.println("Yıl: " + informationCar.getYear());


   }
}