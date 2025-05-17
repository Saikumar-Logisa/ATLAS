public class LinkedList{
    public static void main(String[] args){
        SingleLL list = new SingleLL();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.insert(6,3);
        list.display();
        list.size();
    }
    
    public static class SingleLL{
    Node head;
    Node tail;
    int size;
    
    public SingleLL(){
        this.size = size;
    }
    
    public class Node{
        Object val;
        Node next;
        
        public Node(Object val){
            this.val = val;
        }
        
        public Node(Object val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    
    public void add(Object val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        
        if (tail == null){
            tail = head;
        }
        size++;
    }
    
    public void append(Object val){
        Node node = new Node(val);
        if (tail == null){
            add(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }
    
    public void insert(Object val, int index){
        if (index ==0){
            add(val);
            return;
        }
        if (index ==size){
            append(val);
            return;
        }
        
        Node temp = head;
        for (int i =1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    
    public void size(){
        System.out.println(size);
    }
}
}

