package ch03.sec03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class boxedStream {

    public static void main(String[] args) {
        List<Integer> ints = IntStream.of(3, 1, 4, 1, 5, 9).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);


        ints.forEach(System.out::println);

    }

}
