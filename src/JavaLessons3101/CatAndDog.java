package JavaLessons3101;

public class CatAndDog {
    public static void main(String[] args) {

        Dog myFirstDog = new Dog();
        Dog mySecondDog = new Dog();

        Cat ourFirstCat = new Cat();
        Cat ourSecondCat = new Cat();

        myFirstDog.name = "Bobik";
        myFirstDog.age = 2;
        myFirstDog.breed = "Kolly";

        mySecondDog.name = "Barbos";
        mySecondDog.age = 4;
        mySecondDog.breed = "Taksa";

        ourFirstCat.name = "Murzik";
        ourFirstCat.age = 3;
        ourFirstCat.color = "Black";

        ourSecondCat.name = "Lucky";
        ourSecondCat.age = 2;
        ourSecondCat.color = "Red";



        System.out.println(myFirstDog.name + " " + myFirstDog.age + " " + myFirstDog.breed);
        System.out.println(mySecondDog.name + " " + mySecondDog.age + " " + mySecondDog.breed);
        System.out.println(ourFirstCat.name + " " + ourFirstCat.age + " " + ourFirstCat.color);
        System.out.println(ourSecondCat.name + " " + ourSecondCat.age + " " + ourSecondCat.color);

    }
}