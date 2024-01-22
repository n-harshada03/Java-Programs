

public class LinkedList {
    public static Node head;
    public static Node tail;
    public static int size;
    
    public static class Node{     //create node class 
        int data;
        Node next;
        
        public Node(int data ){
            this.data=data;
            this.next=null;
        }
    
    }
     public  void addFirst(int data){
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            
            newNode.next=head;
            head=newNode;
        }
    public void addLast(int data ){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    
    public void printList(){
        if(head==null){
            System.out.println("null");
            return;
        }
        
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        //traverse till prev node (size-2)
        Node prev =head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        
        int val=prev.next.data;
        prev.next=null;
        size--;
        return val;
    }
    
    public void removeNthfromEnd(int n){
        //calculate size--
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        
        if(n==sz){
            head=head.next;//remove firdt Node
            return;
        }
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        
        prev.next=prev.next.next;      //main step of linking 
        return;
        
    }
    public static void main(String args[]){
        
        LinkedList l1=new LinkedList();

        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.printList();
        
        // System.out.println(l1.size);
        System.out.println(LinkedList.size);
        l1.removeNthfromEnd(4);
        l1.printList();
        

    }
    
}
