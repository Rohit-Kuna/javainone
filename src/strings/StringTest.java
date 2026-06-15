package strings;

import java.util.List;

public class StringTest {
    public static void main(String[] args){
        // Strings are immutable

        // defining string
        String s1="Hello";

        // Any Object to String -> obj.toString()
        Integer num=100;
        String numString = num.toString();
        String numString2= String.valueOf(num);

        // Length -> s1.length() method
        int len=s1.length();

        // Concatenation
        String s2=s1+"thanks";
        String s3=s1.concat("great");

        // to get the character at particular index -> s.charAt(index)
        char ch=s1.charAt(1);

        // String to char array
        char[] charArray = s1.toCharArray();

        // Methods on strings
        // NOTE : When ever we apply string modification methods the string is not affected a new string is returned every time
        // as String is immutable

        // Substring -> similar to python slicing
        // s.substring(beginIndex) -> beginIndex to lastIndex
        s1.substring(2);

        // s.substring(beginIndex,endIndex] -> endIndex is excluded
        s1.substring(1,4);

        // equality
        boolean eq1=s1.equals(s2);

        // Compare
        // Does lexicograpically comparison and and first char which is different the ascii diff is returned
        String r1="rest";
        String r2="resp";
        int diff = 't'-'p'; // 4
        int compareRes1=r1.compareTo(r2); // 4 // this compareTo is overriden method as String implements Comparable
        System.out.println(diff==compareRes1);

        // if one finishes before another returns r3.length() - r4.length()
        String r3="cool";
        String r4="coolie";
        int diff2=r3.length()-r4.length(); // 2
        int compareRes2=r3.compareTo(r4); // 2
        System.out.println(diff2==compareRes2);

        // caps come before smaller due to lower ascii of caps
        // A -> 65
        // a-> 97
        int compareRes3="asiA".compareTo("asia");
        System.out.println(compareRes3<0); // should be negative

        int compareRes4=s1.compareToIgnoreCase(s2);

        // res < 0 -> s1 before s2
        // res = 0 -> s1 == s2
        // res > 0 -> s1 after s2

        // String formatting methods
        s1.toLowerCase();
        s1.toUpperCase();

        String words="    Hello World             ";
        System.out.println(words.trim()); // remove all spaces

        String name="om priya shanti priya";
        name.contains("priya"); // true
        String replaced=name.replace("priya","jaya");
        System.out.println(replaced);

        name.startsWith("om");
        name.endsWith("a");

        // Join
        List<String> list1=List.of("This","is","a","sentence");
        String[] list2={"This","is","another"};
        String sentence2=String.join("-", list1);
        String sentence3=String.join(" ", list2);
        System.out.println(sentence2);

        // Split
        String tobesplit="Hi hello there";
        String[] wordsArray=tobesplit.split(" ");

        // char to string
        char ch1='a';
        String chStr=String.valueOf(ch1);
        String chStr2=Character.toString(ch1);

        // String to char
        String str2="A";
        char ch2=str2.charAt(0);

        // Joining chars back to string
        char[] charArray2={'a','b','c'};

        // as Strin.valueOf() takes char[] too
        String.valueOf(charArray2);

        // simplest
        String res=new String(charArray2);

        // format
        String arg0="Anil";
        int arg1=2;
        String f1=String.format("Hi there %s, a table for %d" , arg0, arg1);
        System.out.println(f1);

    }
}
