package examples;

import java.util.stream.IntStream;

public class InfiniteStream {

    public void execute() {
        IntStream.iterate(0, i -> (i + 1) % 2)
                .limit(10)
                .distinct()
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        InfiniteStream is = new InfiniteStream();
        is.execute();
    }
}
