package types;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Pair<F, S> {
    public final F fst;
    public final S snd;

    public static <F, S> Pair<F, S> create(F fst, S snd) {
        return new Pair<>(fst, snd);
    }

}
