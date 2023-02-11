/*
AND OR Operation
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given the following pseudocode:

code :
res = a
for i = 1 to k
if i is odd
res = res & b
else
res = res | b

You are also given the values of a, b and k. Find the value of res.
Input
First line contains of single integer t denoting number of test cases.
Each test cases consists of 3 lines where each line consists of a single integer denoting the values of a, b and k respectively.

Constraints
1<= T <= 1e5
1<= a, b, k <= 1e18
Output
Print the final value of res for each test case in a new line */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        //Scanner scn = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int tc=  scn.nextInt();
        int tc =Integer.parseInt(br.readLine());
        String str;
        String [] arr;
        long a,b,k,res;
        
        
        while(tc>0){
            tc--;
            str = br.readLine();
            arr= str.trim().split(" ");
            //a = scn.nextLong();
            //b = scn.nextLong();
            //k = scn.nextLong();
            a =Long.parseLong(arr[0]);
            b=Long.parseLong(arr[1]);
            k = Long.parseLong(arr[2]);
            
            res =a;
            if(k>2){ k=2;}
            for(int x=1;x<=k;x++){
                if(x%2 != 0){
                    res =(res & b);
                }else{
                    res = (res | b);
                }
            }
            System.out.println(res);
        }

    }
}