package examples;

import java.util.Optional;

public class OptionalExample {

    public void execute() {
        Optional<String> maybeString = Optional.empty();

        var foo = maybeString
                .map(this::runIfExist)
                .orElseThrow(() -> new RuntimeException("something went wrong"));

        System.out.println(foo);
    }


    private String runIfExist(String string) {
        System.out.println("only run if optional is filled");
        return string;
    }


    public static void main(String[] args) {
        OptionalExample oe = new OptionalExample();
        oe.execute();
    }
}
