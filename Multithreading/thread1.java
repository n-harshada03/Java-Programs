package Multithreading;

class mythread extends Thread {

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

class mythread2 extends Thread {

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

class thread1 {

    public static void main(String args[]) {

        mythread obj1 = new mythread();
        mythread2 obj2 = new mythread2();

        obj1.start();
        obj2.start();

    }
}