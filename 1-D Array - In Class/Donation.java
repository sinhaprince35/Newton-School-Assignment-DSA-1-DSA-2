/*
Donation

easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
After the decimation, the world went into chaos. People had to rebuild the planet so Shield came up with a donation strategy. They feel all the rich guys need to donate more than the poor guys. So, they make a rule. They would make a donation list in which the donation of each person would be shown. But the rule is that a person can’t pay less than what has already been paid before them. Find the extra amount each person will pay, and also, tell shield the total amount of donation.
Input
The first line contains n, the total number of people donating. The next line contains n space-separated integers denoting the amount of money paid by the people. The amounts are mentioned in the order in which the people paid.

Constraints:-
1 <= n <= 100000
0 <= money <= 100000
Output
The first line contains the extra money that each student has to pay after their teacher applied the rule. The second line contains the total amount collected by the teacher at the end.
Example
Sample Input 1:-
10
1 2 3 2 4 3 6 6 7 6

Sample Output 1:-
0 0 0 1 0 1 0 0 0 1
43

Sample Input 2:-
7
10 20 30 40 30 20 10

Sample Output 2:-
0 0 0 0 10 20 30
220 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here

                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int a[] = new int[n];

                for(int i=0;i<n;i++)
                    a[i]=sc.nextInt();

                for(int i=0;i<n;i++){
                    if(i==0)
                        System.out.print(0+" ");
                    else if(a[i]<a[i-1]){
                        System.out.print(a[i-1]-a[i]+" ");
                        a[i]+=(a[i-1]-a[i]);
                    }
                    else
                        System.out.print(0+" ");
                }

                System.out.println();

                long sm = 0;
                for(int i=0;i<n;i++)
                    sm+=a[i];

                System.out.println(sm);
    }
}