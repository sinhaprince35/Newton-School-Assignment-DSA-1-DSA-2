/* 
Penny and Charity
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There is a charity which has N people. Penny wants to donate some of her clothes to the charity in such a way that all people receive equal clothes and each individual receives more than 1 . If she has M clothes with her what is the maximum number of clothes one individual can get?
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Charity() that takes integers N, and M as arguments.

Constraints:-
1 <= M, N <= 1000
Output
Return the maximum number of clothes one individual can get if it is impossible to distribute clothes return -1.
Example
Sample Input
6 20

Sample Output
3

Sample Input
8 5

Sample Output
-1
*/

static int Charity(int Log, int Kapde){
    //Enter your code here
    int answer = Kapde/Log;
    
    if (answer >=2) {
        return answer;
        }else{
            return-1;
        }
    
    }