package JavaLesson4.StringOperation;

public class WorkingWithString {
    public static void main(String[] args) {

        String text = "Это текст для проверки работы методов типа String";

        System.out.println("Our working text is - " + text);

        String testString1 = "работ";

        String textToLowCase = text.toLowerCase();

        boolean resultContains = text.contains(testString1);

        System.out.println("String " + testString1 + " contains? - " +resultContains);

        testString1 = "Pert";

        resultContains = text.contains(testString1);

        System.out.println("String " + testString1 + " cnotains? - " + resultContains);

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        System.out.println(text);

        String textAfterTrim = text.trim(); // Убирает только ПРОБЕЛЫ

        String oldString = "In Java, Olga the best, super java programmer";

        String newString = oldString.replace('J','*');
        System.out.println(newString);

        newString = oldString.replace("Olga", "@All group 240123");
        System.out.println(newString);

        System.out.println(newString.indexOf('@'));










    }
}
