package abstraction.abstraction_classes;

public interface Bluetooth {
    void connectBluetooth();

    //Methods that have bodies - later version of Java

    //Static method
    static int getYear(){
        return 2022;
    }

    //Default method (non-static method that can hava a body)
    default boolean isConnected(){
        return true;
    }

}
