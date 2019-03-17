package types;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Optional;

@Getter
@AllArgsConstructor
@ToString
public class Beer {
    String name;
    Double alcohol;

    public void setName(String name) {
        this.name = name;
    }




}
