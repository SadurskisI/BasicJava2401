package javaLesson6.staticExample;

public class PersonDemo {
    public static void main(String[] args) {
        System.out.println();
        Person personOlga = new Person();
        personOlga.name = "Olga";
        personOlga.town = "Dnepr";

        Person personPetr = new Person();
        personPetr.name = "Petr";
        personPetr.town = "Dnept";

        System.out.println("==========Olga==========");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);

        System.out.println("==========Petr===========");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);

        personPetr.town = "Kiyv";

        System.out.println("==========Olga==========");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);

        System.out.println("==========Petr===========");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);


    }
}
