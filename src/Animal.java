public class Animal {
    void makeSound() {
        System.out.println("Animals were singing on Ali father farm"  );
    }

    //statik class olarak oluştursaydık mainde
    // Animal firstAnimal = new Animal.Cat();
    // şeklinde çağırabilirdik.

    class Cat extends Animal{
        void makeSound() {
            System.out.println("Miyav miyav");
        }
    }

    class Dog extends Animal{
        @Override
        void makeSound() {
            System.out.println("Hav hav");
        }
    }
    // Ama şu an sınıf içerisinde sınıf olduğu için mainde
    // Animal firstAnimal = new Animal().new Cat(); şeklinde
    // çağırdık.
}
