import java.util.*;
import java.util.Scanner;
public class Problem02 {
    
    public static void main(String[] args){
        Stack<String> ops = new Stack<String>();
        Stack<Double> values = new Stack<Double>();

        Scanner StdIn = new Scanner("( 1 + ( ( 2 - 3 ) * ( 14 * 5 ) ) )"); 
        Scanner StdIn1 = new Scanner("( ( 1 + sqrt ( 5 ) ) / 2.0 )"); 
        
        while (StdIn.hasNext()){
            String s = StdIn.next();
            if      (s.equals("("))               ;
            else if (s.equals("+"))       ops.push(s);
            else if (s.equals("-"))       ops.push(s);
            else if (s.equals("*"))       ops.push(s);
            else if (s.equals("/"))       ops.push(s);
            else if (s.equals("sqrt"))    ops.push(s);
            else if (s.equals(")")){
            String op = ops.pop();
            double v = values.pop();
                
                if (op.equals("+"))       v = values.pop() + v;
                if (op.equals("-"))       v = values.pop() - v;
                if (op.equals("*"))       v = values.pop() * v;
                if (op.equals("/"))       v = values.pop() / v;
                if (op.equals("sqrt"))    v = Math.sqrt(v);
                values.push(v);
                
            }     else values.push(Double.parseDouble(s));
        }
        System.out.println(values.pop());
    }
    
}
