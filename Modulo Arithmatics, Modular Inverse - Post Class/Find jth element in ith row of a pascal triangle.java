/*

Find jth element in ith row of a pascal triangle

medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
In a pascal triangle starting from top to bottom. Find the value of the element in a given row and column position i.e. ith row and at jth position.

Input
The first line of input contains an integer T denoting the number of test cases. Each test case will have two integers indexes of the ith row and jth column provided in the new line.

Constraints:
1 <= T <= 100
0 <= j <= i <= 500
Output
Print the answer for each testcase in separated line. Since the output can be very large, mod your output by 10^9+7.*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int MAX = 3001;
	public static long MOD = (long) 1e9 + 7;
	public static void main (String[] args) {
       
		ArrayList<Long>[] array = new ArrayList[MAX];
		
		for(int i = 0; i < MAX; i++){
			array[i] = new ArrayList<Long>();
		}
		
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		int n = sc.nextInt();
		int vl=sc.nextInt();
        for(int i = 0; i <= n; i++){
			for(int j = 0; j <= i; j++){
				if(j == 0 || j == i){
					array[i].add(Long.valueOf(1));
				}
				else{
					array[i].add((array[i-1].get(j-1) + array[i-1].get(j)) % MOD);
				}
			}
		}
		System.out.println(array[n].get(vl));

		
		t--;
		}
	}
}