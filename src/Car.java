public class Car {

    private String marka;
    private String model;
    private int year;

    public Car(String marka, String model, int year){
        this.marka = marka;
        this.model = model;
        this.year = year;
    }

    public void carCard() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + year);
    }

}
