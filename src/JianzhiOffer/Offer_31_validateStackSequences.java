package JianzhiOffer;

import java.util.Stack;

public class Offer_31_validateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int num: pushed) {
            stack.push(num);
            while (!stack.isEmpty()){
                if (stack.peek()==popped[i]) {
                    stack.pop();
                    i++;
                } else break;
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
    public boolean validateStackSequences1(int[] pushed, int[] popped) {
        //下面代码写的贼烂，是在入栈之前判断，如果在入栈后判断就会轻松很多。
        int i,j = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (i = 0; i < pushed.length; i++){
            if (pushed[i] != popped[j]) {
                if (stack.isEmpty()) stack.push(pushed[i]);
                else {
                    boolean b = false;
                    while (!stack.isEmpty()){
                        int top = stack.peek();
                        if (top==popped[j]) {
                            stack.pop();
                            j++;
                            b = true;
                        } else {
                            stack.push(pushed[i]);
                            b=false;
                            break;
                        }
                    }
                    if (b) i--; // 这里会导致出错，出错案例
                    //[1,2,3,0]
                    //[2,1,3,0]
                    //[1,2,3,4,5]
                    //[4,5,3,2,1]
                }
            } else {
                j++;
            }
        }
        while (!stack.isEmpty()){
            int top = stack.peek();
            if (top!=popped[j]) return false;
            j++;
            stack.pop();
        }
        return true;
    }
}
