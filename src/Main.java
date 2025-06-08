//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) {

       /* JA-1 JA-2
       Car carCard = new Car("Vokswagen", "T-Roc", 2025);

       carCard.informationCar();

        */


       /* JA-3

       Car informationCar = new Car();

         informationCar.setMarka("Volkswagen");
         informationCar.setModel("T-Roc");
         informationCar.setYear(2025);

       System.out.println("Marka: " + informationCar.getMarka());
       System.out.println("Model: " + informationCar.getModel());
       System.out.println("Yıl: " + informationCar.getYear());

       */

/* JA-5
       Vehicle soldVehicle = new Vehicle();
       soldVehicle.start();

       Car soldCar = new Car();
       soldCar.start();
*/

/*JA-6
Animal firstAnimal = new Animal().new Cat();
Animal secondAnimal= new Animal().new Dog();

firstAnimal.makeSound();
secondAnimal.makeSound();

*/

/* JA-7

      Calculator calculator = new Calculator();

      int firstSummation = calculator.add(7,70);
      System.out.println("İki sayının toplamı: " + firstSummation);

      int secondSummation = calculator.add(5,12,13);
      System.out.println("Üç sayının toplamı: " + secondSummation);

*/

/* JA-8

      int multiply = Calculator.multiply(6,8);
      System.out.println("Çarpma işleminin sonucu: " + multiply);

*/

/* JA-9
      Student student =new Student ("Deniz",17,510);
      student.display();

*/

/*JA-10
      Shape circle = new Circle();
      Shape rectangle = new ()Rectangle();

      circle.draw();
      rectangle.draw();
*/
 Animal cat = new Cat();
 Animal dog = new Dog();

 cat.sound();
 dog.sound();
   }
}