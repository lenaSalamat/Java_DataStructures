public class Tree {
    Node root =new Node();
    int count = 0;
    boolean val;

    private class Node {
        //your code is here
        int value;
         Tree[] children =new  Tree[10];
    }

    public boolean addChild(int val) {
       //your code is here
        if(count >= 10){
            return false;
        }
        Tree child =new Tree();
        child.root.value = val;
        this.root.children[count++] = child;
        return true;
    }

    public boolean contains(int val) {
        //your code is here
        if(this.root.value == val){
            System.out.println(this.root.value);
            val = true;
            return true;
        }
        if(this.count == 0){
            return val;
        }
        for(int i = 0 ; i < count ; i++){
           System.out.println(val);
           val = this.root.children[i].contains(val); 
        }
        if(val){
            System.out.println("value");
            val = false;
            return true;
        }
        System.out.println("lolo");
        return val;
    }

    public void display() {
        //your code is here
        System.out.println(this.root.value);
        if(this.root.children[0] == null){}
        else {
        for(int i = 0 ; i < this.root.children.length ; i++){
            this.root.children[i].display();
            }
        }
    }

}
