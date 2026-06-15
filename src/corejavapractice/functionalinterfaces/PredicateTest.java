package corejavapractice.functionalinterfaces;

import java.util.function.Predicate;
import java.util.List;

public class PredicateTest {
    public static void main(String[] args) {
        // Functional interfaces is used as reference type for lambda expressions
        // Predicate is a functional interface
        // It helps us store conditions in a variable
        Predicate<Integer> isEven = x->x%2==0;
        Predicate<Integer> isOdd = isEven.negate(); // to get condition's opposite

        List<Integer> evenList=List.of(-4,0,1,2,3,4).stream().filter(isEven).toList();
        System.out.println(evenList);

        Predicate<String> startsWithV = s->s.charAt(0)=='v';
        Predicate<String> endsWithL = s->s.charAt(s.length()-1)=='l';
        Predicate<String> startsWithVAndEndsWithL=startsWithV.and((endsWithL));
        System.out.println(startsWithVAndEndsWithL.test("vipul"));

        Predicate<String> startsWithVOrEndswithL=startsWithV.or(endsWithL);
        System.out.println(startsWithVOrEndswithL.test("Paul"));

        // isEqual is a static method of Predicate interface
        // Predicate.isEqual() checks values (content), not object references.
        String a=new String("Here");
        String b=new String("Here");
        System.out.println(a==b);
        Predicate<String> equalOrNot= Predicate.isEqual(b);
        System.out.println(equalOrNot.test(a));

    }
}
