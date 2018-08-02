public class Stack {
	 private int size ;
	 private long[] array;
	 private int top;

	 public Stack(int val) {
        size = val;
        array = new long[size];
        top = -1;
    }
    //your code is here
    public void push(int pushedElement){
       //your code is here
    	array[++top] = pushedElement;
    }
    public void pop() {
        //your code is here
        return array[top--];
    }

}