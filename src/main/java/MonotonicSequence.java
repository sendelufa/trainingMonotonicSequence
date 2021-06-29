public class MonotonicSequence implements Sequence {

  private int value;

  @Override
  public Integer next() {
    value = value + (Math.random() > 0.4 ? 0 : 1);
    return value;
  }

  @Override
  public boolean hasNext() {
    return true;
  }
}
