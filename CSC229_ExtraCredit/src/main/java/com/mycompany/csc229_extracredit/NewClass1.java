package com.mycompany.csc229_extracredit;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Deque;

public class NewClass1 {


   public static void main(String[] args) {
       System.out.println("Enter your word: ");
      Scanner scnr = new Scanner(System.in);
     

        String inputString = scnr.nextLine();
        Deque deque = new LinkedList();

        for (int i = inputString.length()-1; i >=0; i--) {
            deque.add(inputString.charAt(i));
        }

        String reverseString = "";

        while (!deque.isEmpty()) {
            reverseString = reverseString+deque.remove();
        }
        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

        
    }
   
}

