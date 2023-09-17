package com.praveen.recursion;

import java.util.Arrays;

public class ReverseArray {

  private void reverseArray(int[] a,int[] b,int c){
    if (a.length == c)
      return;
    b[c] = a[a.length-1-c];
    reverseArray(a,b,++c);
  }

  private void reverseUsingTwoVariable(int[] a,int l,int r){
    if(l>=r)
      return;
    swap(a,l,r);
    reverseUsingTwoVariable(a,++l,--r);
  }

  private void swap(int[] a, int l, int r) {
    int value = a[l];
    a[l] = a[r];
    a[r]= value;
  }

  public static void main(String[] args) {
    ReverseArray reverseArray = new ReverseArray();
    int[] a ={1,2,3,4,5,6};
    int[] b = new int[a.length];
    int c = 0;
    reverseArray.reverseArray(a,b,c);
    reverseArray.reverseUsingTwoVariable(a,0,a.length-1);
    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(a));
  }
}
