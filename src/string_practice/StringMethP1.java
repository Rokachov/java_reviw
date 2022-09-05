package string_practice;

public class StringMethP1 {
    public static void main(String[] args){

        // charAt(int index): returns the char at given index, return type --> char
        String str = "Cydeo";
        //index:      01234

        char ch4 = str.charAt(4);

        System.out.println(ch4);
        System.out.println(str.charAt(3)); // I can print it this way if I'm not going to reuse it
        System.out.println(str);

        System.out.println("---------------------------------------------------------");

        //length(): returns the total number of characters. return type --> int
        String str2 = "Wooden Spoon";

        int n1 = str2.length();
        System.out.println(n1);

        int lastIndex = str2.length()-1;
        System.out.println("lastIndex = " + lastIndex);

        System.out.println("---------------------------------------------------------");

        // toLowerCase(): returns the all lower case version of the String. return type --> String
        String str3 = "Java";

        str3.toLowerCase();  // a new String is being created but if we don't reassign it,
        System.out.println(str3);//it will still print the original

        String toLw = str3.toLowerCase();
        System.out.println(toLw);


        System.out.println("---------------------------------------------------------");

        // toUpperCase(): returns the all Upper case version of the String. return type --> String
        String str4 = "Java";

        str4.toUpperCase();// a new String is being created but if we don't reassign it,
        System.out.println(str4);//it will still print the original

        str4 = str4.toUpperCase();
        System.out.println(str4);

//        String toUp = str4.toUpperCase();
//        System.out.println(toUp);


        System.out.println("---------------------------------------------------------");

        // trim(): returns the String without all the white spaces (unused spaces). return type --> String
        String str5 = "           Java Programing   Language             ";
        str5 = str5.trim();

        System.out.println(str5);

        System.out.println("---------------------------------------------------------");

        // indexOf(): returns the first matching character index number. return type --> int

        String str6 = "Wooden Spoon";
        int indexNumOfFirstO = str6.indexOf("o");
        System.out.println("indexNumOfFirstO = " + indexNumOfFirstO);

        int indexNumOfSecondO = str6.indexOf("od");
        System.out.println("indexNumOfSecondO = " + indexNumOfSecondO);

        int indexNumOfThirdO = str6.indexOf("oon") ;
        System.out.println("indexNumOfThirdO = " + indexNumOfThirdO);

        int indexNumOOfThirdO = str6.indexOf("po") +1; // +1 at the end, so we know the Third O this other way
        System.out.println("indexNumOOfThirdO = " + indexNumOOfThirdO);

        System.out.println("---------------------------------------------------------");

        // lastIndexOf(): returns the last matching character index number. return type --> int
        String str7 = "Wooden Spoon";

        System.out.println(str7.lastIndexOf("o"));

        int indexOfLastO = str7.lastIndexOf("o");
        System.out.println("indexOfLastO = " + indexOfLastO);
    }
}
