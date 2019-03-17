package examples;

import java.util.List;
import java.util.function.Function;

import exception.MyException;
import types.Beer;
import types.Either;


public class ExceptionExample {

    public Beer doSomething(Beer beer) throws MyException {
        if (Math.random() * 10 > 5) throw new MyException("aaaaah");
        return beer;
    }

    public void execute() {
        var beerLib = List.of(
                new Beer("Heineken", 5.2),
                new Beer("Amstel", 5.1),
                new Beer("Grolsch", 4.8)
        );

        beerLib.stream()
                .map(this::trySomething)
                .forEach(System.out::println);
    }

    private Beer trySomething(Beer beer) {
        try {
            return doSomething(beer);
        } catch (MyException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        ExceptionExample ee = new ExceptionExample();
        ee.execute();
    }

}
