
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
        // Highest numbers (first and second)
        int num1 = arr[0]; 
        int num2 = arr[1]; 
        
        //Loop through the rest of the arry and check for the greater numbers
        for(int i = 2; i < n; i++) 
        {   
            if(arr[i] > num1 ){ 
                num1 = arr[i];
                
            }else if(arr[i] > num2 ){
                num2 = arr[i];
            }
        }
        return num1 * num2;
    
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


    

