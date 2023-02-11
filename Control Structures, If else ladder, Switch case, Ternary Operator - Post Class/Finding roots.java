/*

Finding roots

medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a program to find the roots of a quadratic equation.
Note: Try to do it using Switch Case.

Quadratic equations are the polynomial equations of degree 2 in one variable of type f(x) = ax2 + bx + c = 0 where a, b, c, ∈ R and a ≠ 0. It is the general form of a quadratic equation where 'a' is called the leading coefficient and 'c' is called the absolute term of f (x).
Input
The first line of the input contains the three integer values a, b, and c of equation ax^2 + bx + c.

Constraints
1 ≤ a, b, c ≤ 50
Output
Print the two roots in two different lines and for imaginary roots print real and imaginary part of one root with (+/- and i )sign in between in one line and other in next line. For clarity see sample Output 2.

Note Imaginary roots can also be there and roots are considered upto 2 decimal places.
Example
Sample Input 1 :
4 -2 -10

Sample Output 2 :
1.85
-1.35

Sample Input 2 :
2 1 10

Sample Output 2:
-0.25+i2.22
-0.25-i2.22 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);
    double a,b,c;
    double root1, root2;
	a= sc.nextInt();
	b= sc.nextInt();
	c= sc.nextInt();
    double determinant = b * b - 4 * a * c;
    if (determinant > 0) {
      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      root2 = (-b - Math.sqrt(determinant)) / (2 * a);
      System.out.println(String.format("%.2f", root1));
	  System.out.println(String.format("%.2f", root2));
    }
    else if (determinant == 0) {
      root1 = root2 = -b / (2 * a);
      System.out.println(String.format("%.2f", root1));
    }
    else {
      double real = -b / (2 * a);
      double imaginary = Math.sqrt(-determinant) / (2 * a);
      System.out.println(String.format("%.2f+i%.2f",real, imaginary));
      System.out.println(String.format("%.2f-i%.2f",real, imaginary));
    }
    }
}