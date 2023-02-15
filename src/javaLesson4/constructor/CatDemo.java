package javaLesson4.constructor;

public class CatDemo {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.name = "Barsik";
        myCat.color = "White";
        myCat.age = 2;

        String message = "My cat - " + myCat.name + ";" + " " + "Color - " + myCat.color + ";" + " " + "Age - " + myCat.age + ";";

        System.out.println(message);

        Cat myCat2 = new Cat("Lucky","Grey",3);

        String message2 = "My cat - " + myCat2.name + ";" + " " + "Color - " + myCat2.color + ";" + " " + "Age - " + myCat2.age + ";";
        System.out.println(message2);

        Cat myCat3 = new Cat();




    }
}
