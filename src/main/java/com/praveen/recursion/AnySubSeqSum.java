package com.praveen.recursion;

import java.util.ArrayList;
import java.util.List;

public class AnySubSeqSum {

  private boolean printSubSeq(int indx,List<Integer> arrList,int[] a, int sum,int condSum){
    if(indx>=a.length){
      if(sum==condSum){
        System.out.println(arrList.toString());
        return true;
      }
      return false;
    }
    arrList.add(a[indx]);
    sum = sum+a[indx];
    if(printSubSeq(indx+1,arrList,a,sum,condSum))
      return true;
//    arrList.remove(arrList.size()-1);
    arrList.remove(Integer.valueOf(a[indx]));
    sum = sum-a[indx];
    if(printSubSeq(indx+1,arrList,a,sum,condSum))
      return true;
    return false;
  }


  public static void main(String[] args) {
    AnySubSeqSum anySubSeqSum = new AnySubSeqSum();
    int a[] = {1,2,1};
    List<Integer> arrList = new ArrayList<>();
    anySubSeqSum.printSubSeq(0,arrList,a,0,2);
  }
}
