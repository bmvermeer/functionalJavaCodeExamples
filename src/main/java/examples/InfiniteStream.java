package examples;

import java.util.stream.IntStream;

public class InfiniteStream {

    public void execute() {
        IntStream.iterate(0, i -> (i + 1) % 2) //0,1,0,1,0,1 etc.
                .distinct() //0,1
                .limit(10) //1-0, 2-1, 3-?
                .forEach(System.out::println); //runs forever
    }


    public static void main(String[] args) {
        InfiniteStream is = new InfiniteStream();
        is.execute();
    }
}
