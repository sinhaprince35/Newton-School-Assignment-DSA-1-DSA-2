/*

Grid and phrase

easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an n*m grid which contains lower case English letters. How many times does the phrase "saba" appear horizontally, vertically, and diagonally in the grid?

The phrase "saba" must look one of these shapes:

Input
First line: Two integer n and m, where n denotes (1 <= n, m <= 100) the number of rows and m denotes the number of columns in the grid.
Next n lines: Each line must contain a string of length m which contains lower- case English letters only.

Constraints
1 ≤ n, m ≤ 100
Output
Print the number of times the word “saba” appears in the grid.

Example
Sample Input 1:
5 5
s a f e r
a m j a d
b a b o l
a a r o n
s o n g s

Sample Output 1:
2
*/

#include<bits/stdc++.h>
using namespace std;
#define int long long
const int M=1e2+10;
char jad[M][M];
int n,m,ans;
bool check(char a,char b,char c,char d)
{
  if(a=='s' && b=='a' && c=='b' && d=='a')
    return true;
  return false;
}
int32_t main()
{
  cin>>n>>m;
  for(int i=1;i<=n;i++)
    for(int j=1;j<=m;j++)
      cin>>jad[i][j];
  for(int i=4;i<=n;i++)
    for(int j=1;j<=m-3;j++)
      if(check(jad[i][j],jad[i-1][j+1],jad[i-2][j+2],jad[i-3][j+3]))
    ans++;
  for(int i=1;i<=n-3;i++)
    for(int j=1;j<=m-3;j++)
      if(check(jad[i][j],jad[i+1][j+1],jad[i+2][j+2],jad[i+3][j+3]))
    ans++;
  for(int i=1;i<=n;i++)
    for(int j=1;j<=m-3;j++)
      if(check(jad[i][j],jad[i][j+1],jad[i][j+2],jad[i][j+3]))
    ans++;
  for(int i=1;i<=n-3;i++)
    for(int j=1;j<=m;j++)
      if(check(jad[i][j],jad[i+1][j],jad[i+2][j],jad[i+3][j]))
    ans++;
  cout<<ans<<endl;
  return 0;
}