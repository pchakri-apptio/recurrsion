package com.praveen.recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

  private void NqLogic(int index,int n,List<List<String>> Nq){
    if(index == n){
      System.out.println("+++++++======");
      for(int i=0;i<n;i++){
        System.out.println(Nq.get(i).toString());
      }
      return;
    }
    for(int row=0;row<n;row++){
      if(index ==0 || isSafe(row,index,Nq)) {
        List<String> rowList = new ArrayList<>(Nq.get(row));
        rowList.set(index, "Q");
        Nq.set(row,rowList);
        NqLogic(index + 1, n, Nq);
        rowList.set(index, "");
        Nq.set(row, rowList);
      }
    }
  }

  private boolean isSafe(int row, int index, List<List<String>> nq) {
    int dupRow = row;
    int dupCol = index;
    while(row>=0 && index>= 0){
      if(new ArrayList<>(nq.get(row)).get(index).equals("Q")) return false;
      row--;
      index--;
    }
    row= dupRow;
    index = dupCol;
    while(index>=0){
      if(new ArrayList<>(nq.get(row)).get(index).equals("Q")) return false;
      index--;
    }

    index = dupCol;
    while(row<nq.size() && index>= 0){
      if(new ArrayList<>(nq.get(row)).get(index).equals("Q")) return false;
      row++;
      index--;
    }
    return true;
  }


  public static void main(String[] args) {
    NQueens nQueens = new NQueens();
    List<String> NqRow = new ArrayList<>();
    for(int i=0;i<4;i++)
      NqRow.add("");
    List<List<String>> Nq = new ArrayList<>();
    for(int i=0;i<4;i++)
      Nq.add(NqRow);
    nQueens.NqLogic(0,4,Nq);
  }
}
