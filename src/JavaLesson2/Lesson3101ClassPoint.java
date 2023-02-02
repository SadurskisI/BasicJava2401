package JavaLesson2;

public class Lesson3101ClassPoint {
    public static void main(String[] args) {
    int a = 5;

    Point point = new Point();

    point.xCoordinate = 1;
    point.yCoordinate = 5;
    point.commenmt = "New point #1 ";

    Point point2 = new Point();

    point2.xCoordinate = 10;
    point2.yCoordinate = 25;
    point2.commenmt = "Second point ";

        System.out.println(point.commenmt + " " + point.xCoordinate + " " + point.yCoordinate);
        System.out.println(point2.commenmt + " " + point2.xCoordinate + " " + point2.yCoordinate);

    }
}
