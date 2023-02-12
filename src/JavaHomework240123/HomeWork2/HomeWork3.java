package JavaHomework240123.HomeWork2;

public class HomeWork3 {
    public static void main(String[] args) {
//        Temperature1 temp1 = new Temperature1(101);
//        Temperature2 temp2 = new Temperature2(99);
        int temperature1 = 101;
        int temperature2 = 99;
        boolean itWorks;

        if ((temperature1 > 100) && (temperature2<100)) {
            itWorks = true;
            System.out.println(itWorks);
        }else{
            itWorks = false;
            System.out.println(itWorks);
        }
    }
}
