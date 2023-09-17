package com.praveen.recursion;

public class LinearPrint {

  private void printFunction(int number,int count){
    if(number==count)
      return;
    System.out.println(++number);
    printFunction(number,count);

  }


  public static void main(String[] args) {
    LinearPrint linearPrint = new LinearPrint();
    linearPrint.printFunction(0,4);
  }
}
