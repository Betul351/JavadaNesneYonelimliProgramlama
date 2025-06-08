interface Animal {
/*JA-6
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
    // çağırdık

 */






    void sound();
}

class Cat implements Animal{
    @Override
    public void sound(){
        System.out.println("Miyav miyav");
    }
}

class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("Hav hav");
    }
}