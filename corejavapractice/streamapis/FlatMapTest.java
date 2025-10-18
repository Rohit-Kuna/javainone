package corejavapractice.streamapis;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {
    public static void main(String[] args) {
        List<List<String>> sentences = Arrays.asList(
            Arrays.asList("Hello", "World"),
            Arrays.asList("Java", "Streams"),
            Arrays.asList("FlatMap", "Example")
        );

        // Without flatMap: Stream<Stream<String>>
        // With flatMap: Stream<String>
        List<String> allWords1 = sentences.stream()
            .flatMap(s->s.stream())
            .collect(Collectors.toList());

        List<String> allWords2 = sentences.stream()
            .flatMap(Collection::stream)
            .collect(Collectors.toList());

        System.out.println(allWords1);
    }
}

