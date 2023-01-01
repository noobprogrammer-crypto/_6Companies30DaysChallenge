package Microsoft;
import java.util.*;
public class EvaluateRPN {
    public static int evalRPN(String[] tokens) {
     Stack<Integer> st = new Stack<>();
     for(String t : tokens){
         if("+-*/".contains(t)){
             st.push(eval(st.pop(),st.pop(),t));
         }else{
             st.push(Integer.parseInt(t));
         }
     }
     return st.pop();
    }
    public static int eval(int b, int a, String operand){
        if("+".equals(operand)){
            return a+b;
        }else if("-".equals(operand)){
            return a-b;
        }else if("*".equals(operand)){
            return a*b;
        }else return a/b;
    }
    public static void main(String[] args) {

    }
}
