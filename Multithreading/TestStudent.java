package Multithreading;

class Student {
    int id;
    String name;

    public void display(int id, String name) {
        System.out.println("hello");
    }
}

class TestStudent {

    public static void display1(int id, String name) {
        System.out.println("world");
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display(0, "karan");

        display1(6, "ggg");

    }
}