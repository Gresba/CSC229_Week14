// Tiffany Chan
// Lab Assignment 01
package com.mycompany.lab_assignment_01;

// Creat a class name Course
public class Course {

    int ID;
    String name;
    int Code;
    
    Course(){
    // Default constructor
    ID = 1000;
    name = "CSE229";
    Code = 101;
}
    
    //an overloaded one that accepts 3 parameters to update the member variables.
    Course(int num1, String str, int num2){
        ID = num1;
        name = str;
        Code = num2;
    }
    // Getters and Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }
    
    
    public static void main(String args[]){
       // create with default constructor
       Course course = new Course();
       System.out.println("Course ID is: " + course.getID());
       System.out.println("Course name is: " + course.getName());
       System.out.println("Course Code is: " + course.getCode());
    
       Course course2 = new Course(2000, "BCS220", 102);
       // change the id, namde, and code
       System.out.println("Course ID is: "+course2.getID());
       System.out.println("Course name is: "+course2.getName());
       System.out.println("Course Code is: "+course2.getCode()); 
       
  }
    
}
