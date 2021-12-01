import java.util.*;
import java.util.Scanner;
public class ParenMatch
{
 public static void main (String[] args)
 {
Stack s = new Stack();
String line; // the string of characters to be checked
Scanner scan = new Scanner(System.in);
System.out.println("\nParenthesis Matching");
System.out.println("Enter a parenthesized expression: ");
line = scan.nextLine();
boolean ok = true;
// loop to process the line one character at a time
// print the results

for (int i = 0; i < line.length() && ok; i++){
    String ch = line.substring(i, i+1);
    if (ch.equals("(")){
        s.push(ch);
    }
    else if (ch.equals(")")){
        if (s.empty()){
            System.out.println("Extra right parenthesis");
            ok = false;
        }
        else{
            s.pop();
        }
   }
}
if (ok)
    if (s.isEmpty()){
    System.out.println("Match");
}else{
        System.out.println("More left then right");
    }

 }
}