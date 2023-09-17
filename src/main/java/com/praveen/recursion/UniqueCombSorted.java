package com.praveen.recursion;

import java.util.ArrayList;
import java.util.List;

public class UniqueCombSorted {

  private void combinationResult(int ind, int[] a, List<Integer> arrList,
                                 List<List<Integer>> destArrList,
                                 int target) {
    if (target == 0) {
      destArrList.add(new ArrayList<>(arrList));
      return;
    }
    for (int i = ind; i < a.length; i++) {
      if (i > ind && a[i] == a[i - 1]) {
        continue;
      }
      if (a[i] > target) {
        break;
      }
      arrList.add(a[i]);
      combinationResult(ind + 1, a, arrList, destArrList, target - a[i]);
      arrList.remove(arrList.size() - 1);
    }
  }

  public static void main(String[] args) {
    UniqueCombSorted uniqueCombSorted = new UniqueCombSorted();
    int a[] = {1, 1, 1, 2, 2};
    List<Integer> arrList = new ArrayList<>();
    List<List<Integer>> destArrList = new ArrayList<>();
    uniqueCombSorted.combinationResult(0, a, arrList, destArrList, 4);
    System.out.println(destArrList);
  }
}
