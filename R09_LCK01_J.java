// BEFORE

public void doSomething() {
    synchronized ("LOCK") {
        // ...
    }
}

// AFTER

private final Object lock = new Object();

public void doSomething() {
  synchronized (lock) {
    // ...
  }
}
