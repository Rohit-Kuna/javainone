package strings;

public class CharTest {
    public static void main(String[] args){
        // primitive to Object
        char a1='c';

        // auto
        Character A1=a1;

        // using XXX.valueOf()
        Character A2=Character.valueOf(a1);

        // Object to primitive
        Character B1='k';

        // auto
        char b1= B1;

        // using obj.charValue()
        char b2=B1.charValue();

        // char to String
        char c1='p';
        String s1=String.valueOf(c1);

        // String to char
        String s2="l";
        char c2=s2.charAt(0);

        // Checking the type of characrter
        Character.isAlphabetic('A');
        Character.isLetter('F');
        Character.isDigit('2');
        Character.isLetterOrDigit('8');

        // Character.isWhitespace() for checking spaces, newline, tab
        Character.isWhitespace(' ');
        Character.isWhitespace('\n');
        Character.isWhitespace('\t');

        // character to int
        Character.getNumericValue('7');

        // ------------------------------->

        // case check
        Character.isLowerCase('b');

        Character.isUpperCase('A');

        // case change
        Character.toLowerCase('D');

        Character.toUpperCase('c');

        // equals primitive
        boolean eq1='a'=='b';

        Character E='E';
        Character F='F';
        boolean eq2=E.equals(F);

        // compare
        // Primitive
        int compareRes1=Character.compare(c1, c2);
        int compareRes2=Character.compare(E, F); // E, F are auto converted to primitive char

        // Objects Compare
        // Character implements Compable, hence compareTo would be available
        int compareRes3=E.compareTo(F);

        //

    }
}
