package corejavapractice.streamapis;

import java.util.List;
import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Objects;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestCollectors {
    public static void main(String ...args){
        Employee e1=new Employee("Rahul", "Mumbai");
        Employee e2=new Employee("Anjali", "Hyderabad");
        Employee e3=new Employee("Guru", "Delhi");
        Employee e4=new Employee("Thakur", "Mumbai");
        List<Employee> elist=Arrays.asList(e1,e2,e3,e4);
        Stream<Employee> employeeStream=elist.stream();
        // List<Employee> res= employeeStream.filter(Objects::nonNull).toList();
        
        Map<String,List<Employee>> grouped=employeeStream.filter(Objects::nonNull).collect(Collectors.groupingBy(s->s.getLocation()));
        // Object grouped=employeeStream.filter(Objects::nonNull).collect(Collectors.groupingBy(s->s.getLocation()));
        // Object entrySet=grouped.entrySet();/
        // System.out.println(entrySet.getClass());
        // List<String> keys=entrySet.getKeys();
        for(Map.Entry<String,List<Employee>> p : grouped.entrySet()){
            p.getKey();
            p.getValue();
        }

        grouped.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });

        Stream<Integer> s1=Arrays.asList(1,2,3,4,5,6).stream();

        Stream<Integer> s2=Stream.of(1,2,3,4,5,6);

        Stream<Integer> s3=Stream.iterate(0,n->n+1).limit(4);

        // 3rd largest
        List<Integer> l1=Arrays.asList(2,6,1,18,4,9);
        Integer res1 = l1.stream().sorted(Collections.reverseOrder()).skip(2).findFirst().orElse(null);
        Integer res2 = l1.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(null);
        Integer res3 = l1.stream().sorted((a,b)->Integer.compare(b,a)).skip(2).findFirst().orElse(null);
        Integer res4 = l1.stream().sorted((a,b)->b.compareTo(a)).skip(2).findFirst().orElse(null);
        System.out.println(res2);

        Stream<Integer> numbers=Stream.iterate(0, n->n+1).limit(10);
        Map<Boolean,List<Integer>> evenOddGroup=numbers.collect(Collectors.partitioningBy(n->n%2==0));
        evenOddGroup.forEach((key,value)->{
            System.out.println(key);
            System.out.println(value);
        });

        // Object o1 = Collectors.partitioningBy(m->m%2==0);
        // System.out.println(o1);



    }
}


