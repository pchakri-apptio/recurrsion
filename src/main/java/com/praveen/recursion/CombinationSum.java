package com.praveen.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

  private void printCombinationSum(int ind, List<Integer> arrList,int targetSum,int[] a,
                                   int finalTargetSum){

    if(arrList.stream().mapToInt(Integer::intValue).sum() == finalTargetSum)
      System.out.println(arrList.toString());

    if(ind>=a.length || a[ind] > targetSum)
      return;

//    if(ind>=a.length){
//      if(targetSum == 0)
//        finalTagetArr.addall(arrList);
//      return;
//    }

    if(a[ind]<=targetSum){
      arrList.add(a[ind]);
      printCombinationSum(ind,arrList,targetSum-a[ind],a,finalTargetSum);
      arrList.remove(arrList.size()-1);
    }
    printCombinationSum(ind+1,arrList,targetSum,a,finalTargetSum);
  }

  public static void main(String[] args) {
    CombinationSum combinationSum = new CombinationSum();
    int a[] = {1,2,1,1,1};
    List<Integer> arrList = new ArrayList<>();
    combinationSum.printCombinationSum(0,arrList,5,a,5);
  }
}
