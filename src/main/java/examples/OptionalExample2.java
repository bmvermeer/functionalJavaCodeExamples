package examples;

import types.Beer;
import types.Beer2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExample2 {

    public void execute() {
        var beerLib = List.of(
                new Beer2("Heineken", 5.2, "Famous beer"),
                new Beer2("Amstel", 5.1),
                new Beer2("Grolsch", 4.8, "not so Famous beer")
        );

        beerLib.stream()
                .map(Beer2::getDescription) //returns optional
                .flatMap(o -> o.map(Stream::of).orElse(Stream.empty()))
                .forEach(System.out::println);


    }


    public static void main(String[] args) {
        OptionalExample2 oe = new OptionalExample2();
        oe.execute();
    }
}
