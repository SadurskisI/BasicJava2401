package JavaHomework240123.HomeWork2;

public class HomeWork1 {
    public static void main(String[] args) {
        boolean canWalk;
        boolean isWeekend = true;
        boolean isRain = false;

        if ((isWeekend == true) && (isRain == false)) {
            canWalk = true;
        } else {
            canWalk = false;
        }
        System.out.println(canWalk);
    }
}
