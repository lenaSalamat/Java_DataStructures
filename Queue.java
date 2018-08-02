public class Queue {
   // your code is here
    int[] arr = new int[3];
    int count = 0;

    public void push(int pushedElement){
       //your code is here
        arr[count] = pushedElement;
        count++;
    }

    public void pop(){
        //your code is here
        System.out.println(arr[0]);
        for(int i = 0 ; i < 2 ; i++){
            arr[i] = arr[i + 1];
        }
        arr[count - 1] = 0;
        count--;
    }
    public void display(){
        //your code is here
        for(int j = 0 ; j < count ; j++){
           System.out.println(arr[j]); 
        }
    }

}