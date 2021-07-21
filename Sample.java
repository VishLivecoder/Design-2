// Time Complexity : Amortized O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :Nope


// Your code here along with comments explaining your approach
//Design Queue using 2 stacks

class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() {
        stack1=new Stack<Integer>();
        stack2=new Stack<Integer>();
        
        
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        while((stack1.isEmpty()==false)){
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(stack2.isEmpty()==false){
            stack1.push(stack2.pop());
        }
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack1.pop();
        
    }
    
    /** Get the front element. */
    public int peek() {
        return stack1.peek();
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */