package encapsulation;

public class Car {

    //instance variables
    public String make;
    private int year = 2020;
    private double price; //Require a password

    //Providing indirect access to year
    //Set and get info
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Reading - getting info
    public double getPrice() {
        return price;
    }

   //Writing - setting info
    public void setPrice(double price, String adminPassword) {
        if (adminPassword.equals("abcd1234"))this.price = price;
        else throw new RuntimeException("The password entered is not valid!!");
    }

    public boolean isConvertible() {
        return true;
    }
}
