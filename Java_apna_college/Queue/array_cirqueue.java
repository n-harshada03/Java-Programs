package Java_apna_college.Queue;

public class array_cirqueue {
    static int arr[];
    static int size;
    static int rear;
    static int front;

    array_cirqueue(int n){
        arr=new int[n];
        size=n;
        rear=-1;
        front=-1;
    }

    public static boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    public static boolean isFull(){
        return (rear+1)%size==front;
    }
    //add 
    public static void add(int data){
        if(isFull()){
            System.out.println("queue is Full");
            return;
        }

        //add first element 
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;//initialize with data
    }
    //remove
    public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int result=arr[front];
        //last ele delt
        if(rear==front){
            rear=front=-1;
        }
        else{
            front=(front+1)%size;
        }
        return result;
    }

    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[front]; 
    }

    public static void main(String[] args) {
        array_cirqueue q=new array_cirqueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
