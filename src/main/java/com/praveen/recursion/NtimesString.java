package com.praveen.recursion;

public class NtimesString {
  private void printName(String name, int count, int n){
    if(count == n)
      return;
    System.out.println(name);
    printName(name,++count,n);
  }
  public static void main(String[] args) {
    NtimesString ntimesString = new NtimesString();
    int n = 10;
    ntimesString.printName("praveen",0,n);
  }
}
