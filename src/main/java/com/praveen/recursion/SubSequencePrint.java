package com.praveen.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequencePrint {

  private void printSubSequence(int ind,List<Integer> subSeq, int[] a){
    if(ind>=a.length){
      int count =subSeq.stream().mapToInt(Integer::intValue).sum();
      if(count >= 3) {
        System.out.println(subSeq.toString());
      }
      return;
    }
    subSeq.add(a[ind]);
    printSubSequence(ind+1,subSeq, a);
    subSeq.remove(subSeq.size()-1);
    printSubSequence(ind+1,subSeq, a);
  }


  public static void main(String[] args) {
    SubSequencePrint subSequencePrint = new SubSequencePrint();
    List<Integer> subSeq = new ArrayList<Integer>();
    int a[] = {3,1,2};
    subSequencePrint.printSubSequence(0,subSeq,a);
  }
}
