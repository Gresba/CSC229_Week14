
package com.mycompany.week10_classroomsubmission;

// Problem 01: Find the sum of all prime numbers between 0 and n that 
// have the digit 3 in them such as from 0 to 20 the sum is 16 

public class NewClass {
    

      private static boolean sol2_has3 (int num){ // the cost of this log10 n
       
        while (num > 2){
            if (num % 10 == 3) return true;
            else num = num / 10;
        }
        return false;
        
   }  
      
    private static int getSumOfPrimesWith3(int n){ // Time cost: (n * square root of n * log n)
        int sum = 0;
        for (int i = 2; i <= n; i++){
        if (isPrime(i) && sol2_has3(i)) sum += i;
    }
        return sum;
    }
    
    private static boolean isPrime (int num){ // Time cost:  square root of n
        int counter = 0;
        for (int i = 0; i <= num / i; i++){
           counter++;
        if (num % i == 0)return false;
        }
        return true;
        
    }
   // Problem 02: Find the sum of the last m numbers in a list of size n?
    
    class Node {
   public int data;
   public Node next;
   public Node previous;

   public Node(int initialData) {
      data = initialData;
      next = null;
      previous = null;
   }
}

   private Node head;
   private Node tail;
   
       public int sumOfLast (int m){
        Node node = tail;
        int sum = 0;
        while (node != null && m > 0){
            sum += node.data; m--;
            node = node.previous;
        }
        return sum;
    }
       
       
       
    public static void main(String[] args){
    //   System.out.println("" + getSumOfPrimesWith3(7907));

    }
    
    
}
