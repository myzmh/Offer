package JianzhiOffer;

import java.util.Stack;

public class Offer_30_MinStack {
    Stack<Integer> A;
    Stack<Integer> B;
    /** initialize your data structure here. */
    public Offer_30_MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        if (B.empty() || x <= B.peek()) B.push(x);
        A.push(x);
    }

    public void pop() {
//        if(B.peek() == A.peek()) 这样写不对，
        int x = B.peek();
        int y = A.peek();
        if (x == y) {
            A.pop();
            B.pop();
        } else {
            A.pop();
        }
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }
}

// 下面版本是我写的  算法复杂度O(N),人家要求O(1)
//public class Offer_30_MinStack {
//    int minV = Integer.MAX_VALUE;
//    Stack<Integer> stack;
//    /** initialize your data structure here. */
//    public Offer_30_MinStack() {
//        stack = new Stack<>();
//    }
//
//    public void push(int x) {
//        if (x < minV) minV = x;
//        stack.push(x);
//    }
//
//    public void pop() {
//        if (minV==stack.peek()){
//            stack.pop();
//            minV = Integer.MAX_VALUE;
//            Stack<Integer> stack1 = new Stack<>();
//            while(!stack.empty()){
//                int x = stack.pop();
//                if (x < minV) minV = x;
//                stack1.push(x);
//            }
//            while (!stack1.empty()){
//                int x = stack1.pop();
//                stack.push(x);
//            }
//        }else{
//            stack.pop();
//        }
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int min() {
////        if (stack.empty()) return null;
//        return minV;
//    }
//}
