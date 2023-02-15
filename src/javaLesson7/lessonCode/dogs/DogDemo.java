package javaLesson7.lessonCode.dogs;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobik", 2,"black");
        dog1.voice();
        dog1.changeColor("White");
        dog1.voice();
        System.out.println(dog1.getColor());
        dog1.setColor("red");
        System.out.println(dog1.getColor());
        dog1.voice();
    }
}
