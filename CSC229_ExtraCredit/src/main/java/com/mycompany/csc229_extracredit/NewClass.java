
package com.mycompany.csc229_extracredit;
// Develop an algorithm (Java or C++) that can find the ratio of the sum of the
// largest two numbers divided by the sum of the smallest two numbers in an array. 
// The solution should be linear or better.  
public class NewClass {
    
  
    public static void main(String[] args){
    int a[] = {3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};
// int a[] = {100,900,200,1, 10, 5, 2, 2000};
  
  // Finding the largest two number:
    double largest = a[0];
    double secondLargest = a[0];

    for (int i = 0; i < a.length; i++) {
 
      if (a[i] > largest) {
        secondLargest = largest;
        largest = a[i];
 
      } else if (a[i] > secondLargest) {
        secondLargest = a[i];
 
      }
    }
  
    double largestTwo = largest + secondLargest;
    
 // Finding the smallest two number:
    double smallest = a[0], secondSmallest = a[0];
    for (int i = 0; i < a.length; i++) {
 
      if (a[i] < smallest) {
        secondSmallest = smallest;
        smallest = a[i];
 
      } else if (a[i] < secondSmallest) {
        secondSmallest = a[i];
 
      }
    }
    double smallestTwo = smallest + secondSmallest;
    double ratio = largestTwo / smallestTwo;
 
    System.out.printf("The ratio is: %.1f", ratio);
  //  System.out.println("\nThe smallest two number is " + smallestTwo);
   // System.out.println("The largest two number is " + largestTwo);
 
  }
}