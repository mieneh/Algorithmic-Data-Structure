import java.lang.reflect.Array;
import java.util.Arrays;

class Test {
  public static String sTab(int n) {
    String s = "";
    while (n != 0) {
      s += "\t";
      n--;
    }
    return s;
  }

  static int getMax(int a[], int n) {
    int mx = a[0];
    for (int i = 1; i < n; i++)
      if (a[i] > mx)
        mx = a[i];
    return mx;
  }

  static void countSort(int a[], int n, int exp, int tab) {
    System.out.println(sTab(tab) + "a: " + Arrays.toString(a));

    int output[] = new int[n];
    System.out.println(sTab(tab) + "output: " + Arrays.toString(output));

    int i;
    int count[] = new int[10];
    Arrays.fill(count, 0);
    System.out.println(sTab(tab) + "count: " + Arrays.toString(count));

    System.out.println(sTab(tab) + String.format("i = 0"));
    for (i = 0; i < n; i++) {
      System.out.println(sTab(tab + 1) +
                         String.format("i < n (%d < %d => %b)", i, n, i < n));

      System.out.println(sTab(tab + 1) + "count: " + Arrays.toString(count));
      count[(a[i] / exp) % 10]++;
      System.out.println(sTab(tab + 1) + "count: " + Arrays.toString(count));

      System.out.println(sTab(tab) + String.format("i++ = %d", i + 1));
    }
    System.out.println(sTab(tab + 1) +
                       String.format("i < n (%d < %d => %b)", i, n, i < n));

    //
    System.out.println(sTab(tab) + String.format("i = 1"));
    for (i = 1; i < 10; i++) {
      System.out.println(sTab(tab + 1) + String.format("i < 10 (%d < %d => %b)",
                                                       i, 10, i < 10));

      count[i] += count[i - 1];
      // System.out.println(sTab(tab + 1) + "count: " + Arrays.toString(count));
    }
    System.out.println(sTab(tab + 1) +
                       String.format("i < 10 (%d < %d => %b)", i, 10, i < 10));

    System.out.println(sTab(tab + 1) + "count: " + Arrays.toString(count));

    //
    System.out.println(sTab(tab) + String.format("i = n - 1 = %d", n - 1));
    for (i = n - 1; i >= 0; i--) {
      System.out.println(
          sTab(tab + 1) +
          String.format("i >= 0 (%d >= %d => %b)", i, 0, i >= 0));

      output[count[(a[i] / exp) % 10] - 1] = a[i];
      count[(a[i] / exp) % 10]--;
      System.out.println(sTab(tab + 1) + "count: " + Arrays.toString(count));
      System.out.println(sTab(tab + 1) + "output: " + Arrays.toString(output));
    }
    System.out.println(sTab(tab + 1) +
                       String.format("i >= 0 (%d >= %d => %b)", i, 0, i >= 0));

    System.out.println(sTab(tab) + String.format("i = 0"));
    for (i = 0; i < n; i++) {
      System.out.println(sTab(tab + 1) +
                         String.format("i < n (%d < %d => %b)", i, n, i < n));

      a[i] = output[i];
      System.out.println(sTab(tab + 1) + "a: " + Arrays.toString(a));
    }
    System.out.println(sTab(tab + 1) +
                       String.format("i < n (%d < %d => %b)", i, n, i < n));
    System.out.println(sTab(tab) + "a: " + Arrays.toString(a));
  }

  static void radixsort(int a[], int n, int tab) {
    System.out.println(sTab(tab) + "a: " + Arrays.toString(a));
    int m = getMax(a, n);
    System.out.println(sTab(tab) +
                       String.format("m = getMax(a, n) = %d", getMax(a, n)));

    System.out.println(sTab(tab) + String.format("exp = 1"));
    int exp;
    for (exp = 1; m / exp > 0; exp *= 10) {
      System.out.println(sTab(tab + 1) +
                         String.format("m / exp > 0 (%d / %d > 0 => %b)", m,
                                       exp, m / exp > 0));

      countSort(a, n, exp, tab + 2);
    }
  }

  public static void main(String[] args) {
    int[] a = {5, 1000, 2, 7, 20, 400, 100};
    // int[] a = { 5, 17, 2, 7 };
    System.out.println(Arrays.toString(a));
    radixsort(a, a.length, 1);
    System.out.println(Arrays.toString(a));
  }
}
