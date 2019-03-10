package examples;

import java.util.List;
import java.util.stream.Collectors;

import types.Beer;

public class MutateStream {

    private final List<Beer> beers = List.of(new Beer("Heineken", 5.2), new Beer("Amstel", 5.1));

    public void execute() {
        var beers = List.of(
                new Beer("Heineken", 5.2),
                new Beer("Amstel", 5.1));

        var beersNew = beers.stream()
                .collect(Collectors.toList());

        beersNew.forEach(System.out::println);
        System.out.println("------");
        beers.forEach(System.out::println);
    }


    public static void main(String[] args) {
        MutateStream sm = new MutateStream();
        sm.execute();
    }
}
