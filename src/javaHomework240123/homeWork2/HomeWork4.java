package javaHomework240123.homeWork2;


public class HomeWork4 {
    public static void main(String[] args) {
        int startRandomNum = 0;
        int endRandomNum = 28800;
        int seconds = (int) (Math.random()*(endRandomNum-startRandomNum+1) + startRandomNum);
        int minuts = seconds/60;
        int hours = minuts/60;

        System.out.println(seconds);

        if (hours>=5) {
            System.out.println("Осталось " + hours + " часов");
        }
        if ((hours>1) && (hours<5)) {
            System.out.println("Осталось " + hours + " часа");
        }
        if (hours == 1){
            System.out.println("Остался " + hours + " час");
        }
        if (hours<=0){
            System.out.println("Осталось менее часа");
        }
    }
}
