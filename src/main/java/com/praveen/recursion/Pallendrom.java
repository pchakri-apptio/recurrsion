package com.praveen.recursion;

public class Pallendrom {

  private boolean checkPallendrom(char[] s,int l,int r){
    if(s[l] != s[r])
      return false;
    if(l>r)
      return true;
    return checkPallendrom(s,++l,--r);
  }

  public static void main(String[] args) {
    String s="abccba";
    Pallendrom p = new Pallendrom();
    boolean check = p.checkPallendrom(s.toCharArray(),0,s.length()-1);
    System.out.println(check? "Valid": "Not valid");
  }
}
