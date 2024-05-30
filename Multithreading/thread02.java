package Multithreading;

class mythread implements Runnable {

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class mythread2 implements Runnable {

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class thread02 {

    public static void main(String args[]) {

        mythread obj1 = new mythread();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        mythread2 obj2 = new mythread2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}