package com.praveen.recursion;

public class SumofN {

  private void sumFunction(int n,int sum){
    if(n==0){
      System.out.println(sum);
      return;
    }
    sumFunction(n-1,sum+n);
  }

  private int functionSumMethod(int n){
    if(n==0)
      return 0;
    return n+functionSumMethod(n-1);
  }

  public static void main(String[] args) {
    SumofN s = new SumofN();
    s.sumFunction(4,0);
    System.out.println(s.functionSumMethod(4));
  }
}
