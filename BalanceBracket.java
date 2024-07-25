import java.util.Scanner;
import java.util.Stack;

public class BalanceBracket {
    public static boolean areBalanced(String exp){
        Stack<Character> stack = new Stack<>();
        
        for( char ch:  exp.toCharArray()){
            if (ch  == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if (ch ==')' || ch == '}' || ch == ']'){
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '[' && top != ']') || (ch == '{' && top != '}'))
                {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    public static void main(String[]  args){
        Scanner scan = new Scanner(System.in);
        String exp = scan.nextLine();
        scan.close();
        
        System.out.println("Expression: "+exp);
        
        if (areBalanced(exp)){
            System.out.println("Brackets are balanced");
        }
        else{
            System.out.println("Brackets are not balanced");
        }
    }
}



