/*
Queen's attack

easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
In an 8X8 chessboard. Given the positions of the Queen as (X, Y) and the King as (P, Q) .
Your task is to check whether the queen can attack the king in one move or not.

The queen is the most powerful piece in the game of chess. It can move any number of squares vertically, horizontally or diagonally .
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function QueenAttack() that takes integers X, Y, P, and Q as arguments.

Constraints:-
1 <= X, Y, P, Q <= 8

Note:- King and Queen can not be in the same position
Output
Return 1 if the king is in the check position else return 0.
Example
Sample Input:-
1 1 5 5

Sample Output:-
1

Sample Input:-
3 4 6 6

Sample Output:-
0 */

static int QueenAttack(int X, int Y, int P, int Q){
    //Enter your code here
    if (X==P || Y==Q)
    return 1;
    if(Math.abs(X-P)==Math.abs(Y-Q))
    return 1;
    else
    return 0;
    }