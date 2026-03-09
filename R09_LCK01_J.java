private final Object lock = new Object();

public void doSomething() {
  synchronized (lock) {
    // ...
  }
}
