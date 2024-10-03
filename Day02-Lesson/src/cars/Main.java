package cars;

import cars.Car;

public class Main {
    
    public static void main(String[] args) {

        // Creating an instance of the class
        // myCar is an instance of Car   
        Car myCar = new Car("Toyota", "Red");
        myCar.setOwner("Fred");
        myCar.info();

        Car yourCar = new Car();
        yourCar.setMake("Nissan");
        yourCar.setOwner("Barney");
        yourCar.info();

        Car ourCar = new Car();
        ourCar.setMake("BMW");
        ourCar.setOwner("Wilma");
        ourCar.info();

        Car[] trailer = new Car[6];

        


        
    }
}
