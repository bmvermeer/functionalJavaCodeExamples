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
                .map(wrap(beer -> doSomething(beer)))
                .forEach(System.out::println);
    }

    //---
    @FunctionalInterface
    public interface CheckedFunc<T, R> {
        public R apply(T t) throws Exception;
    }

    public <T, R> Function<T, R> wrap(CheckedFunc<T, R> func) {
        return t -> {
            try {
                return func.apply(t);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }


    public static void main(String[] args) {
        ExceptionExample ee = new ExceptionExample();
        ee.execute();
    }

}
