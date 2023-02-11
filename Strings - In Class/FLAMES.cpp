/*
FLAMES ?
medium
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
They say friendship is greater than love. Why not play the famous game "FLAMES".
The rules are super simple. Given two strings (all lowercase), remove all the letters that are common to both the strings from both the strings. You cannot erase a character in first string whichever corresponding same character in other string not exist.
For example, in the case
String 1: saumya
String 2: ansh
You can remove only 1 'a' and 1 's' from both the strings.
Remaining strings are:
String 1: umya
String 2: nh

Now all you need to do is find the sum of the remaining strings length % 6.

Output:
If obtained value is 1, output "Friends"
If obtained value is 2, output "Love"
If obtained value is 3, output "Affection"
If obtained value is 4, output "Marriage"
If obtained value is 5, output "Enemy"
If obtained value is 0, output "Siblings"
Input
You will be given two strings on different lines.

Constraints
1 <= Length of both the strings <= 100000
Output
Output a single string, the result of FLAMES test.
*/

#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

    string str1,str2;
    cin>>str1;
    cin>>str2;

        string str3;
        char c, d;
        int e;

    for (int i = 0; i < str1.length(); i++) {
         c = str1.at(i);
           for (int j = 0; j < str2.length(); j++) {
                d = str2.at(j);
                if (c == d) {
                    str1.erase(i,1);
                    str2.erase(j,1);
                    i--;
                    j--;
                    break;
                }
            }
        }

        str1 = str1.append(str2);

        e = str1.length() % 6;

         switch (e) {
            case 1:
                cout<<"Friends"<<endl;
                break;
            case 2:
                cout<<"Love"<<endl;
                break;
            case 3:
                cout<<"Affection"<<endl;
                break;
            case 4:
                cout<<"Marriage"<<endl;
                break;
            case 5:
                cout<<"Enemy"<<endl;
                break;
            case 0:
                cout<<"Siblings"<<endl;
                break;
            default:
                break;
        }
    }