/*
Palindrome pair
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string of length N. You have to select two non- overlapping (no common index) non- empty substrings of odd lengths from that string such that both those substrings are palindrome. You want the product of lengths of those substring to be maximum.
Input
Input contains of a single String of length N.

Constraints
2 <= N <= 100000
String contains lowercase english letters.
Output
Print a single integer which is the maximum possible product of lengths of selected substrings.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public long maxProduct(String s) {
        int n = s.length();
        if (n == 2) return 1;
        int[] len = manachers(s);              
        
        long left[] = new long[n];               
        
        int max = 1;
        left[0] = max;
        for (int i = 1; i <= n - 1; i++) {
           
            if (len[(i - max - 1 + i)/2] > max) max += 2;
            left[i] = max;
        }
        max = 1;
        long[] right = new long[n];           
        right[n - 1] = max;
        
        for (int i = n - 2; i >= 0; i--) {
             if (len[(i + max + 1 + i)/2] > max) max += 2;
            right[i] = max;
        }
        
        long res = 1;
        
        for (int i = 1; i < n; i++) {            
            res = Math.max(res, left[i - 1] * right[i]);
        }
        return res;
    }
    
	private int[] manachers(String s) {
        
        int len = s.length();
        int[] P = new int[len];
        int c = 0; 
        int r = 0; 
        int maxLen = 0;
       
        for(int i = 0; i < len; i++) {
            int mirror = (2 * c) - i;
            if(i < r) {
                P[i] = Math.min(r - i, P[mirror]);
            }
            
            int a = i + (1 + P[i]);
            int b = i - (1 + P[i]);
            while(a < len && b >= 0 && s.charAt(a) == s.charAt(b)) {
                P[i]++;
                a++;
                b--;
            }
            
            if(i + P[i] > r) {
                c = i;
                r = i + P[i];
            }
        }
        for (int i = 0; i < len; i++) P[i] = 1 + 2*P[i];
        return P;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
       
		String str = sc.next();
	    Main obj = new Main();
		System.out.println(obj.maxProduct(str));
	}
}