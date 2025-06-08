public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("İsim: " +name);
        System.out.println("Yaş:" + age);
    }
}

    class Student extends Person {
        int studentNo;

        Student(String name, int age , int studentNo){
        super(name,age);
        this.studentNo = studentNo;
    }

    void display(){
        super.display();
        System.out.println("Öğrenci No: " + studentNo);
    }
  }

