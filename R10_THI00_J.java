// BEFORE

public final class Foo implements Runnable {
    @Override
    public void run() {
        // ...
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.run();
    }
}

// AFTER

public final class Foo implements Runnable {
  @Override public void run() {
    // ...
  }

  public static void main(String[] args) {
    Foo foo = new Foo();
    new Thread(foo).start();
  }
}
