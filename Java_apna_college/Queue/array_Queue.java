package Java_apna_college.Queue;

public class array_Queue {
    static int arr[];
    static int size;
    static int rear;

    array_Queue(int n){
        arr=new int[n];
        size=n;
        rear=-1;
    }

    public static boolean isEmpty(){
        return rear==-1;
    }
    //add 
    public static void add(int data){
        if(rear==size-1){
            System.out.println("queue is Full");
            return;
        }
        rear=rear+1;
        arr[rear]=data;//initialize with data
    }
    //remove
    public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }

    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        array_Queue q=new array_Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
