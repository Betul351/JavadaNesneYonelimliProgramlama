public class Car {

    private String marka;
    private String model;
    private int year;

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

}
