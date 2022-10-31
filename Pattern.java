/*Pattern
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, you have to print the given below pattern for N >= 3.

Pattern for N = 4:-
*
*^*
*^^*
*****
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Pattern() that takes integers N as argument.

Constraints:-
1 <= N <= 100
Output
Print the given pattern for size N.
Example
Sample input:-
3

Sample Output:-
*
*^*
****

Sample Input:-
6

Sample Output:-
*
*^*
*^^*
*^^^*
*^^^^*
******
*/


static void Pattern(int N){
    //Enter your code here
    if(N>=3){
    
    for(int x=1;x<=N;x++){
    
        if(x==1){
    
        System.out.print("*");
    
        }else if(x>1 && x<N){
    
        System.out.print("*");
    
            for(int y=1;y<x;y++){
    
                System.out.print("^");
    
                }
    
                System.out.print("*");
    
        }else{
    
            for(int z=0;z<=N;z++){
    
                System.out.print("*");
    
                }
    
        }
    
       System.out.println("");
    }
    }
    }