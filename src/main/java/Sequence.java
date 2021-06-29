import java.util.Iterator;

public interface Sequence extends Iterator<Integer> {
    Integer next();
    boolean hasNext();
}
