package com.praveen.recursion;

public class FactorialProblem {

  private int taskMethod(int n){
    if(n==1)
      return 1;
    return n*taskMethod(n-1);
  }

  public static void main(String[] args) {
    FactorialProblem factorialProblem = new FactorialProblem();
    System.out.println(factorialProblem.taskMethod(5));
  }
}
