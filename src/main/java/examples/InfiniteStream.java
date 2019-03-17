package examples;

import java.util.stream.IntStream;

public class InfiniteStream {

    public void execute() {
        IntStream.iterate(0, i -> (i + 1) % 2) //0,1,0,1,0,1 etc.
                .limit(10) //1-0, 2-1, 3-0, 4-1, 5-0 etc.
                .distinct() //0,1
                .forEach(System.out::println); //runs will terminate
    }


    public static void main(String[] args) {
        InfiniteStream is = new InfiniteStream();
        is.execute();
    }
}
