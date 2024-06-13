// quicksort and mergesort
import java.util.Arrays;

class test1 {

  // QUICK SORT
  public static void swap(int[] a, int x, int y) {
    int temp = a[x];
    a[x] = a[y];
    a[y] = temp;
  }

  public static void quickSort(int[] a, int i, int j, int tab) {

    System.out.println(sTab(tab) + Arrays.toString(a));
    System.out.println(sTab(tab) + String.format("quickSort(a, %d, %d)", i, j));
    System.out.println(sTab(tab) +
                       String.format("i < j (%d < %d => %b)", i, j, i < j));
    if (i < j) {
      int pivotIdx = partition(a, i, j, tab + 1);
      System.out.println(sTab(tab + 1) +
                         String.format("pivotIdx = %d", pivotIdx));

      System.out.println(sTab(tab + 1) + String.format("quickSort(a, %d, %d)",
                                                       i, pivotIdx - 1));
      quickSort(a, i, pivotIdx - 1, tab + 2);

      System.out.println(sTab(tab + 1) + String.format("quickSort(a, %d, %d)",
                                                       pivotIdx + 1, j));
      quickSort(a, pivotIdx + 1, j, tab + 2);
    }
  }

  public static int partition(int[] a, int i, int j, int tab) {
    System.out.println(sTab(tab) +
                       String.format("p = a[i] = a[%d] = %d", i, a[i]));
    System.out.println(sTab(tab) + String.format("m = i = %d", i));

    int p = a[i];
    int m = i;

    int k;
    System.out.println(sTab(tab) +
                       String.format("k = i + 1 = %d + 1 = %d", i, i + 1));

    for (k = i + 1; k <= j; k++) {
      System.out.println(
          sTab(tab + 1) +
          String.format("k <= j (%d <= %d => %b)", k, j, k <= j));

      System.out.println(
          sTab(tab + 1) +
          String.format("a[k] < p (%d < %d => %b)", a[k], p, a[k] < p));

      if (a[k] < p) {
        System.out.println(sTab(tab + 2) +
                           String.format("m++ = %d + 1 = %d", m, m + 1));
        m++;

        System.out.println(sTab(tab + 2) + Arrays.toString(a));
        System.out.println(
            sTab(tab + 2) +
            String.format("swap(a, k, m) = swap(a, %d, %d)", k, m));
        swap(a, k, m);
        System.out.println(sTab(tab + 2) + Arrays.toString(a));
      } else {
      }
      System.out.println(sTab(tab + 1) +
                         String.format("k++ = %d + 1 = %d", k, k + 1));
    }

    System.out.println(sTab(tab + 1) +
                       String.format("k <= j (%d <= %d => %b)", k, j, k <= j));

    System.out.println(sTab(tab) + Arrays.toString(a));
    System.out.println(sTab(tab) +
                       String.format("swap(a, i, m) = swap(a, %d, %d)", i, m));
    swap(a, i, m);
    System.out.println(sTab(tab) + Arrays.toString(a));
    System.out.println(sTab(tab) + String.format("return m = %d", m));

    return m;
  }

  public static String sTab(int n) {
    String s = "";
    while (n != 0) {
      s += "\t";
      n--;
    }
    return s;
  }
  // MERGE SORT

  public static void mergeSort(int[] a, int i, int j, int tab) {
    System.out.println(sTab(tab) + String.format("mergeSort(a, %d, %d)", i, j));
    System.out.println(sTab(tab) + "a: " + Arrays.toString(a));
    System.out.println(sTab(tab) +
                       String.format("i < j (%d < %d => %b)", i, j, i < j));
    if (i < j) {
      tab++;

      int mid = (i + j) / 2;
      System.out.println(sTab(tab) +
                         String.format("mid = (i + j) / 2 = (%d + %d) / 2 = %d",
                                       i, j, (i + j) / 2));

      System.out.println(
          sTab(tab) +
          String.format("mergeSort(a, i, mid) = mergeSort(a, %d, %d)", i, mid));
      mergeSort(a, i, mid, tab + 1);

      System.out.println(
          sTab(tab) +
          String.format("mergeSort(a, mid + 1, j) = mergeSort(a, %d, %d)",
                        mid + 1, j));
      mergeSort(a, mid + 1, j, tab + 1);

      System.out.println(
          sTab(tab) +
          String.format("merge(a, i, mid, j) = merge(a, %d, %d, %d)", i, mid,
                        j));
      merge(a, i, mid, j, tab + 1);

      System.out.println(sTab(tab) + "a: " + Arrays.toString(a));
    }
  }

  public static void merge(int[] a, int i, int mid, int j, int tab) {

    int[] temp = new int[j - i + 1];
    System.out.println(sTab(tab) + "temp: " + Arrays.toString(temp));

    int left = i, right = mid + 1, it = 0;
    System.out.println(sTab(tab) + String.format("left = i = %d", i));
    System.out.println(
        sTab(tab) +
        String.format("right = mid + 1 = %d + 1 = %d", mid, mid + 1));
    System.out.println(sTab(tab) + String.format("it = 0"));

    while (left <= mid && right <= j) {

      System.out.println(
          sTab(tab + 1) +
          String.format("left <= mid && right <= j (%d <= %d && %d <=%d => %b)",
                        left, mid, right, j, left <= mid && right <= j));

      if (a[left] <= a[right]) {
        System.out.println(
            sTab(tab + 2) +
            String.format(
                "a[left] <= a[right] (a[%d] <= a[%d] = %d <= %d => %b)", left,
                right, a[left], a[right], a[left] <= a[right]));

        // System.out.println(sTab(tab + 2) + String
        // .format("temp[it++] = a[left++] (temp[%d + 1] = a[%d + 1] = %d)", it,
        // left, a[left + 1]));

        System.out.println(sTab(tab + 2) + "temp: " + Arrays.toString(temp));
        temp[it++] = a[left++];
        System.out.println(sTab(tab + 2) + "temp: " + Arrays.toString(temp));
      } else {
        System.out.println(
            sTab(tab + 2) +
            String.format(
                "a[left] <= a[right] (a[%d] <= a[%d] = %d <= %d => %b)", left,
                right, a[left], a[right], a[left] <= a[right]));

        // System.out.println(sTab(tab + 2) + String
        // .format("temp[it++] = a[right++] (temp[%d + 1] = a[%d + 1] = %d)",
        // it, right, a[right + 1]));

        System.out.println(sTab(tab + 2) + "temp: " + Arrays.toString(temp));
        temp[it++] = a[right++];
        System.out.println(sTab(tab + 2) + "temp: " + Arrays.toString(temp));
      }
    }

    while (left <= mid) {
      System.out.println(sTab(tab + 1) +
                         String.format("left <= mid (%d <= %d => %b)", left,
                                       mid, left <= mid));

      System.out.println(sTab(tab + 1) + "temp: " + Arrays.toString(temp));
      temp[it++] = a[left++];
      System.out.println(sTab(tab + 1) + "temp: " + Arrays.toString(temp));
    }

    while (right <= j) {
      System.out.println(
          sTab(tab + 1) +
          String.format("right <= j (%d <= %d => %b)", right, j, right <= j));

      System.out.println(sTab(tab + 1) + "temp: " + Arrays.toString(temp));
      temp[it++] = a[right++];
      System.out.println(sTab(tab + 1) + "temp: " + Arrays.toString(temp));
    }

    System.out.println(sTab(tab + 1) + String.format("k = 0"));
    int k;
    for (k = 0; k < temp.length; k++) {
      System.out.println(sTab(tab + 1) +
                         String.format("k < temp.length (%d < %d => %b)", k,
                                       temp.length, k < temp.length));
      System.out.println(sTab(tab + 1) + "a: " + Arrays.toString(a));
      a[i + k] = temp[k];
      System.out.println(sTab(tab + 1) + "a: " + Arrays.toString(a));
      System.out.println(sTab(tab + 1) +
                         String.format("k = k++ = %d + 1 = %d", k, k + 1));
    }
    System.out.println(sTab(tab + 1) +
                       String.format("k < temp.length (%d < %d => %b)", k,
                                     temp.length, k < temp.length));
  }

  public static void main(String[] args) {
    // int[] a = { 5, 17, 2, 7, 14, 12, 8 };
    // int[] a = { 5, 17, 2, 7 };
    // mergeSort(a, 0, a.length - 1, 0);
    // System.out.println(Arrays.toString(a));

    int[] b = {5, 17, 2, 7, 14, 12, 8};
    // int[] b = { 5, 17, 2, 7 };
    quickSort(b, 0, b.length - 1, 0);
    System.out.println(Arrays.toString(b));
  }
}
