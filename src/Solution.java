/**
 * Created by Pranith on 1/12/17.
 */
import java.util.*;

public class Solution {

    public static void main(String[] args){
        String[] str= { "4", "13", "5", "/", "+" };
        System.out.println(evalrevpol(str));
    }

    public static int evalrevpol(String[] tokens){

        Stack<String> stack=new Stack<>();
        String string="+-/*";
        int val=0;

        for(String s:tokens){
            if(!string.contains(s)){
                stack.push(s);
            }
            else{
                int a=Integer.valueOf(stack.pop());
                int b=Integer.valueOf(stack.pop());
                switch (s){
                    case "+":
                        stack.push(String.valueOf(a+b));
                        break;
                    case "-":
                        stack.push(String.valueOf(b-a));
                        break;
                    case "/":
                        stack.push(String.valueOf(b/a));
                        break;
                    case "*":
                        stack.push(String.valueOf(a*b));
                        break;
                }
            }

        }
        val=Integer.valueOf(stack.pop());
        return val;
    }

}
