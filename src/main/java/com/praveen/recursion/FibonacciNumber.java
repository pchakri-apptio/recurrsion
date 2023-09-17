package com.praveen.recursion;

public class FibonacciNumber {

  private int giveFibonacci(int n){
    if(n ==0)
      return 0;
    if(n==1)
      return 1;
    return giveFibonacci(n-2)+giveFibonacci(n-1);
  }

  public static void main(String[] args) {
    FibonacciNumber fibonacciNumber = new FibonacciNumber();
    System.out.println(fibonacciNumber.giveFibonacci(7));
  }
}
