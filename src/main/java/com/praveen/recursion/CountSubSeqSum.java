package com.praveen.recursion;


public class CountSubSeqSum {

  private int subSeqCount(int indx, int[] a, int sum, int condSum){
    if(indx>=a.length){
      if(sum==condSum)
        return 1;
      return 0;
    }
    sum+=a[indx];
    int l = subSeqCount(indx+1,a,sum,condSum);
    sum-=a[indx];
    int r = subSeqCount(indx+1,a,sum,condSum);
    return l+r;
  }


  public static void main(String[] args) {
    CountSubSeqSum countSubSeqSum = new CountSubSeqSum();
    int a[] = {1,2,1};
    System.out.println(countSubSeqSum.subSeqCount(0,a,0,2));
  }
}
