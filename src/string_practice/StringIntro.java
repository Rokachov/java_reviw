package string_practice;

public class StringIntro {
    public static void main(String[] args){

        String str = "Java";
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "Java";

        System.out.println(str2 == str3);
        System.out.println(str.equals(str1));
        System.out.println(str);

        System.out.println("-------------------------------------");

        String s1 = new String("Java"); // String ~ Objects ~ by using -> new <- keyword
        String s2 = new String("Java");

        System.out.println(s2 == s1);
        System.out.println(s2);
        System.out.println(s1);

        System.out.println("------------------------------------------");

        String name = "wooden spoon"; // String Objects are immutable
        name = name.toUpperCase(); // --> In this line a new String Object with Upper Case letters is Created. But if you reassign it then if you print it again you will get the word with upper case

        System.out.println(name);
    }
}
