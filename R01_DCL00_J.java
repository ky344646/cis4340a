class A {
  public static int a = B.b();
}

class B {
  public static int b() { return B.c(); }
  public static int c() { return 1; }
}
