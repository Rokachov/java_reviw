package string_practice;

public class StringMthP2 {
    public static void main(String[] args) {

        // replace( oldValue, newValue): replace all the matching character(s) of the  String with the given new character(s). return type --> String
        String str1 = "Wooden Spoon";
        str1 = str1.replace("o", "e");
        System.out.println(str1);

        String sentence1 = "I love Java, Java is the best programming language";
        sentence1 = sentence1.replace("Java", "C#");
        System.out.println(sentence1);

        sentence1 = sentence1.replace("C#", "Java");
        System.out.println(sentence1);


        System.out.println("----------------------------------------------------------");

        // replaceFirst(oldValue, newValue): replace the first matching character (s) of the String with the given new characters. return type --> String
        String str2 = "Wooden Spoon";
        str2 = str2.replaceFirst("o", "e");
        System.out.println(str2);


        String sentence2 = "I love Java, Java is the best programming language";
        sentence2 = sentence2.replaceFirst("Java", "Piton");
        System.out.println(sentence2);

        System.out.println("----------------------------------------------------------");


        // subString(begIndex): creates substring starting from the given beginning index to the end of the String. return type --> String

        String str3 = "Java Programming Language";
        String result1 = str3.substring( str3.indexOf("ua") +1); // substring  ->    "age"
        System.out.println(result1);


        // substring(betIndex,  endIndex): creates substring starting from the given beginning index to th given ending index. return --> String

        String result2 = str3.substring(5, 15 + 1); // whenever you used this substring method the last index will not be included, if we want the last index character to be included we must add (+ 1 ) to see the last index we are looking for
        String result3 = str3.substring(5, 16); // ending index is excluded
        System.out.println(result2);
        System.out.println(result3);

        String result4 = str3.substring( str3.indexOf("P"), str3.lastIndexOf(" "));
        System.out.println(result4);


        String s1 = "I love Java";
        //           0123456789

        String result6 = s1.substring(2, 5+1);
        System.out.println(result6);

        String result5 = s1.substring(2, 6);
        System.out.println(result5);

        result4 = s1.substring( s1.indexOf("l"), s1.lastIndexOf(" "));
        System.out.println(result4);


        System.out.println("----------------------------------------------------------");

        // repeat(N): repeats the string N number of times. return type --> String
        String str4 = "Java";
        String r = str4.repeat(4); //JavaJavaJavaJava
        System.out.println(r);



    }
}
