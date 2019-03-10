package types;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Beer2 {
    String name;
    Double alcohol;
    String description;

    public Beer2(String name, Double alcohol) {
        this.name = name;
        this.alcohol = alcohol;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }


}
