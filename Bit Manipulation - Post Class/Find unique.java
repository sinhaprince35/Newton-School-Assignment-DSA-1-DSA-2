/*
Problem Statement
Given an array of N elements. In the array, each element is present twice except for 1 element whose frequency in the array is 1. Hence the length of the array will always be odd.
Find the unique number.*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);

                      int num = sc.nextInt();
                      int[] arr = new int[num];

                      for(int i=0; i<arr.length; i++){
                          arr[i]=sc.nextInt();
                      }
                     int res=0;
                      for(int j : arr){
                          res ^=j;

                      }
                      System.out.println(res);


    }
}