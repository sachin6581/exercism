import java.util.Stack;

class BracketChecker{
    public String bracket;
    BracketChecker(String bracket){
        this.bracket = bracket;
    }

    public boolean areBracketsMatchedAndNestedCorrectly(){
        Stack<Character> charStack = new Stack<Character>();
        for(int i = 0;i<bracket.length();i++){
            if(bracket.charAt(i) == '{' || bracket.charAt(i) == '(' || bracket.charAt(i) == '['){
                charStack.push(bracket.charAt(i));
                continue;
            }
            switch (bracket.charAt(i)){
                case '}':
                    if(charStack.isEmpty() || charStack.peek() != '{')
                        return false;
                    else
                        charStack.pop();
                    break;
                case ']':
                    if(charStack.isEmpty() || charStack.peek() != '[')
                        return false;
                    else
                        charStack.pop();
                    break;
                case ')':
                    if(charStack.isEmpty() || charStack.peek() != '(')
                        return false;
                    else
                        charStack.pop();
                    break;
            }
        }
        return charStack.isEmpty();
    }
}