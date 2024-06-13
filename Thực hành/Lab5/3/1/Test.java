class Test {

  public static int pow(int x, int n) {
    int total = 1;
    for (int i = 0; i < n; i++) {
      total *= x;
    }
    return total;
  }

  public static double prod_recur(int a, int b) {
    if (a == 1) {
      return b;
    }
    if (b == 1) {
      return a;
    }
    return a + prod_recur(a, b - 1);
  }

  public static int bin2dec(int n, int exp) {
    if (n != 0) {
      return (n % 10) * pow(2, exp) + bin2dec(n / 10, exp + 1);
    }
    return 0;
  }

  public static int max(int a, int b) {
    return a > b ? a : b;
  }

  public static int maxDigit(int n) {
    if (n != 0) {
      return max(n % 10, maxDigit(n / 10));
    }
    return 0;
  }

  public static int maxElement(int[] a, int n) {
    if (n == 0) {
      return a[0];
    }

    return max(a[n - 1], maxElement(a, n - 1));
  }

  public static int search(int[] a, int n, int key) {
    if (n == 0) {
      return key == a[n] ? n : -1;
    }
    if (key == a[n - 1])
      return n - 1;
    return search(a, n - 1, key);
  }

  public static void main(String[] args) {
    System.out.println("a: " + prod_recur(4, 4));
    System.out.println("b: " + bin2dec(1001, 0));
    System.out.println("c: " + maxDigit(1091));

    int[] a = { 1, 2, 3, 4, 5, 1, 1, 2, 10 };
    int key = 9;
    System.out.println("d: " + maxElement(a, a.length));
    System.out.println("e: " + search(a, a.length, key));
  }
}
