package javaLesson5.constructor;

import javaLesson3.calculator.UserInput;

public class CatDemo {
    public static void main(String[] args) {

        UserInput ui = new UserInput();
        UserOutput uo = new UserOutput();
        CatUtil catUtil = new CatUtil();

        Cat myFirstCat = catUtil.createCat();
        Cat mySecondCat = catUtil.createCat();
        uo.printCat(myFirstCat);
        uo.printCat(mySecondCat);


    }
}
