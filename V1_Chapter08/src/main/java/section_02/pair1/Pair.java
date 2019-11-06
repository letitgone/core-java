package section_02.pair1;

import lombok.Data;

/**
 * @author Cay Horstmann
 * @version 1.00 2004-05-10
 */
@Data
public class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
}
