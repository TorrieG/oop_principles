package encapsulation;

import java.util.Scanner;

public class EmployeeClub {
    /*
    Write a program that asks an employee to enter their information age, address and fullName

    Test Data:
    fullName = Alex Robert
    address = 1234 Abc St, Chicago IL 12345
    age = 32

    Print "Alex Robert is in the club" if user is from Chicago and age is more than 21
    Print "Alex Robert is not in the club" otherwise


    EXPECTED OUTPUT:
    Alex Robert is in the club
     */
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Hey, what is your name?");
        emp.setFullName(inputReader.nextLine());

        System.out.println("And, your age please.");
        emp.setAge(inputReader.nextInt());

        inputReader.nextLine();

        System.out.println("Lastly, your address please.");
        emp.setAddress(inputReader.nextLine());

        System.out.println(emp);

        System.out.println(emp.getAddress().toLowerCase().contains("chicago") && emp.getAge() > 21 ?
        emp.getFullName() +" is in the club" : emp.getFullName() + " is not in the club");

    }
}
