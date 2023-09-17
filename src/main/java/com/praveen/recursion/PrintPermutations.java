package com.praveen.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintPermutations {

  private void printMethod(int[] a, List<Integer> ds, List<List<Integer>> ans,
                           boolean freq[]) {
    if (ds.size() == a.length) {
      ans.add(new ArrayList<>(ds));
      return;
    }
    for (int i = 0; i < a.length; i++) {
      if (!freq[i]) {
        ds.add(a[i]);
        freq[i] = true;
        printMethod(a, ds, ans, freq);
        ds.remove(ds.size() - 1);
        freq[i] = false;
      }
    }
  }

  public static void main(String[] args) {
    PrintPermutations printPermutations = new PrintPermutations();
    int a[] = {1, 2, 3};
    boolean[] freq = new boolean[a.length];
    List<List<Integer>> ans = new ArrayList<>();
    printPermutations.printMethod( a, new ArrayList<>(), ans, freq);
    System.out.println(ans.toString());
  }
}
