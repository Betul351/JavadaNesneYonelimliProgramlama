abstract class Shape {

    abstract void draw();
}

class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Dairenin alanı");
    }
}

class Rectangle extends  Shape{
    @Override
    void draw() {
        System.out.println("Dikdörtgenin alanı");
    }
}
