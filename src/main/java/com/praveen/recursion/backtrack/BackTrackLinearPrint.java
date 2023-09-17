package com.praveen.recursion.backtrack;

public class BackTrackLinearPrint {

  private void printFunction(int i,int n){
    if(i<1)
      return;
    printFunction(i-1,n);
    System.out.println(i);
  }

  private void printReverseFunction(int i, int n){
    if(i>n)
      return;
    printReverseFunction(i+1,n);
    System.out.println(i);
  }


  public static void main(String[] args) {
    BackTrackLinearPrint backTrackLinearPrint= new BackTrackLinearPrint();
    backTrackLinearPrint.printFunction(3,3);
    backTrackLinearPrint.printReverseFunction(1,3);
  }
}
