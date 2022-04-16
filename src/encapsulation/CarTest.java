package encapsulation;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();

        //Setting info for make
        car1.make = "BMW";

        //Getting info for make
        System.out.println(car1.make); //BMW

        //Setting info for year
        car1.setYear(2022);

        //Getting info for year
        System.out.println(car1.getYear()); //2020

        car1.setPrice(5000,"abcd1234");
        System.out.println(car1.getPrice());//5000.0

        System.out.println(car1.isConvertible());
    }
}
