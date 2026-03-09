// BEFORE

public static int getAbsAdd(int x, int y) {
    assert x != Integer.MIN_VALUE;
    assert y != Integer.MIN_VALUE;
    int absX = Math.abs(x);
    int absY = Math.abs(y);
    assert (absX <= Integer.MAX_VALUE - absY);
    return absX + absY;
}

// AFTER

public class Widget {
  private int total; // Declared private

  public int getTotal () {
    return total;
  }
  // Definitions for add() and remove() remain the same
}
