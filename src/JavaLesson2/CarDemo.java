package JavaLesson2;

public class CarDemo {
    public static void main(String[] args) {

        Car mySuperCar = new Car();

        mySuperCar.model = "Mercedes G-class";
        mySuperCar.numberOfWheels = 4;
        mySuperCar.isElectric = false;
        mySuperCar.distance = 25125.5;

        System.out.println("Parametrs of my car is: ");
        System.out.println("Model - " + mySuperCar.model);
        System.out.println("Number of wheels is - " + mySuperCar.numberOfWheels);
        System.out.println("My car is electr - " + mySuperCar.isElectric);
        System.out.println("Distance is - " + mySuperCar.distance);

        Car myFriendCar = new Car();

        myFriendCar.model = "Tesla";
        myFriendCar.numberOfWheels = 4;
        myFriendCar.isElectric = true;
        myFriendCar.distance = 100.3;

        System.out.println("Parametrs of my car is: ");
        System.out.println("Model - " + myFriendCar.model);
        System.out.println("Number of wheels is - " + myFriendCar.numberOfWheels);
        System.out.println("My car is electr - " + myFriendCar.isElectric);
        System.out.println("Distance is - " + myFriendCar.distance);


    }
}
