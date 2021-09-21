
package com.mycompany.lab_assignemnt_02;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import java.time.*;
import java.util.Scanner;

public class NewClass {
     public int maxiumPairwise(int[] arr, int n){
        
        if (n < 2){
            System.out.println("No Pairs exits\n");
            
        }
        int pair;

        // Intitialize max product pair
        int num1 = arr[0], num2 = arr[1];
       
        // Traverse through every possible pair
      
        for(int i = 0; i < arr.length; i++){ 
            for (int j = i + 1; j < n; j++){
                if (arr[i]*arr[j] > num1 * num2){
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }
        
        
        // The maxiumum pariaise pair
        pair = num1 * num2;
        
        return pair;
    
}
    
 public static void main(String[] args) throws ParseException {
   // Instant start = Instant.now();
    NewClass name = new NewClass();
    
    Scanner input = new Scanner (System.in);
    // Ask user for the input
    System.out.println("Enter the size of the array: \n");
    int size = input.nextInt();
    
    int[] pairArr = new int[size];
    
    System.out.println("Enter numbers to fill the array: \n");
    for (int i = 0; i < pairArr.length; i++){
        pairArr[i] = input.nextInt();
    }
    
   
    System.out.println("The maxium pairwise product is: " + name.maxiumPairwise(pairArr,size));
    
    
    
 }
}


    

