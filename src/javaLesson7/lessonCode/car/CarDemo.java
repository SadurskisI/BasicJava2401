package javaLesson7.lessonCode.car;

public class CarDemo {
    public static void main(String[] args) {

        Manufactoring manufactoring = new Manufactoring("Mercedes");
        CarColors color1 = new CarColors("Black metallic");




    Car newCar = new Car(manufactoring,"GL350","SUV",color1,100);
        System.out.println(newCar);

        System.out.println("New car manufacuture - " + newCar.manufactoring.manufactoring);

        System.out.println("New car model - " + newCar.model);

        System.out.println("New car body - " + newCar.typeOfBody);

        System.out.println("New car color - " + newCar.carColors.color);

        System.out.println("New car speed limit - " + newCar.getSpeedLimit());

    }
}
