package numbers;

public class IntegerTest {
    public static void main(String[] args){
        // A. primitive to Object
        // int to Integer 
        // auto
        int a= 100;
        Integer A = a;

        // XXXX.valueOf(int x)
        // Integer.valueOf()
        Integer A1 = Integer.valueOf(a);

        // String to Object
        // STring to Integer
        // valueOf can also be used to get value from string
        String hundred="100";
        Integer A2 = Integer.valueOf(hundred);

        // B. Integer Wrapper/Object to primitive
        // auto
        Integer B = 200;
        int twoHundred=B;

        // Using Method : Rule : Wrapper -> primitive : xxxValue()
        // Using method : obj.IntValue()
        Integer B1 = 20;
        int b1 = B1.intValue();

        // String to primitive
        int b2 = Integer.parseInt(hundred);


        // C. String to Integer / int
        //String to Object
        // String to Integer
        Integer C1 = Integer.valueOf(hundred);

        // String to primitive
        // String to int
        int d1 = Integer.parseInt(hundred);

        // D. max and min values of Int range
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;


        // E. Check if two integers are equal
        // In case of primitives
        boolean equalityRes1=3==7;

        // NOTE : 
        // a==b --> checks primitives
        // obj1.equals(obj2) --> for objects
        // if obj1 == obj2 --> if "==" used on objects then addresses are checked (as address or refernce values are primitives)

        // In case of Objects we use
        Integer e1 = 100;
        Integer e2 = 100;
        boolean equalityRes=e1.equals(e2);

        // F. Compare
        /*
        public static int compare(int x, int y) {
            return x < y ? -1 : (x == y ? 0 : 1);
        }
        */
        int f1 = 3;
        int f2 = 10;
        int comparedRes=Integer.compare(f1,f2); // not same as compare() method of Comparator
        
        // res < 0 --> f1 before f2
        // res == 0 --> both are equal
        // res > 0 --> f1 after f2
        System.out.println(comparedRes); // -1

        // extras if f1 and f2 are Integer objects, we can use obj1.compareTo(obj2) as in lists
        Integer f3=9;
        Integer f4=12;
        int comparedRes2=f3.compareTo(f4); // this compareTo is overriden method as Integer implements Comparable
        // and compareTo internally uses Integer.compare(int f1,int f2) primitives
        // we can also use compare directly for Integer objects
        int comparedRes3=Integer.compare(f3,f4); // auto conversion into primitives

    }
}
