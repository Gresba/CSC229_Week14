package com.mycompany.csc229_sep_15;

public class NewClass {
    
   // int[] ar = new int[10];
   // int[] ar1 = {5,7};
    
    int getLargest (int [] nmList){
        int max = nmList[0];
        int indx = 0;
        while (indx < nmList.length){
        if (nmList[indx] > max){
            max = nmList[indx];
        }
        indx++;
    }
        return max;
        
    }
    
    public static void main(String args[]){
        NewClass nc = new NewClass();
        int[] arr = {3, 6, -1, 10, 15, -5};
        int mx = nc.getLargest(arr);
        System.out.println("The max number is " + mx);
                
     
        
    }
    
}
