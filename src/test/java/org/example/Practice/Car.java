package org.example.Practice;

public class Car {

    String Brandname;
    String carname;
    int carnumber;

    void drive(){
        System.out.println("Praveen drive the car brand: " + Brandname);
    }

    void carnumber(){
        System.out.println("Praveen car number: " + carnumber);
    }

    public static void main(String[] args) {

        Car car = new Car();
        car.Brandname = "Mahindra";
        car.carname = "SUV";
        car.carnumber = 123456;

        System.out.println(car.carnumber);
        System.out.println(car.carname);
        System.out.println(car.Brandname);

        car.drive();
        car.carnumber();
    }

}
