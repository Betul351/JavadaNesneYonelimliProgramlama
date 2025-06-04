import java.time.Year;

public class Car extends Vehicle {

    /* JA-1 JA-2
    private String marka;
    private String model;
    private int year;



    public Car (String marka, String model, int year) {
        this.marka = marka;
        this.model = model;
        this.year = year;
    }

    public void informationCar() {
        System.out.println("Marka: " +marka);
        System.out.println("Model: " +model);
        System.out.println("Year: "+ year);
    }

     */

/* JA-3
    public Car () {

    }

    //getter (okuma)
    public  String getMarka() {
        return marka;
    }
    //setter (atama)
    public void setMarka(String marka){
        this.marka = marka;
    }

    public String getModel () {
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

 */


/* JA-4

private String marka;
private String model;
private int year;

public Car( String marka,String model, int year) {
    this.marka=marka;
    this.model=model;
    this.year=year;
}

public void informationCar() {
    System.out.println("Marka: " + marka);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);

    System.out.println("Hız: " + hiz + "km/h");
    }
*/

/* JA-5
    @Override
    void start() {
        System.out.println("Araç Satıldı");
    }
*/

}
