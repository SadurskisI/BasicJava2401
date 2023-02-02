package JavaLesson4.StringOperation;

public class StringOparations {
    public static void main(String[] args) {

        String text = "Это текст для проверки работы методов типа String";

        String text1 ="";

        String str1 = "Java";
        String str2 = new String("java");

        System.out.println(text.length());

        System.out.println(text1.length());

        System.out.println(text.isEmpty());
        System.out.println(text1.isEmpty());

        System.out.println(text.isBlank());
        System.out.println(text1.isBlank());

        char sinbol = text.charAt(2);
        System.out.println(sinbol);

        System.out.println(text.substring(45));
        String subText = text.substring(0,49);
        System.out.println(subText + subText.length());

        String subText2 = text.substring(0,49);
        System.out.println(subText + subText.length());

        String text3 = "aaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbssssssssssssssss";
        System.out.println(text3.length());
        System.out.println(text3.length()-1);
        System.out.println(text3.charAt(text3.length()-1));
    }
}
