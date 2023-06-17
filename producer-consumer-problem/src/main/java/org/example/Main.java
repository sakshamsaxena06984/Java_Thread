package org.example;

public class Main {
    public static void main(String[] args) {
        Company comp=new Company();
        Producer p=new Producer(comp);// it is implementing the thread
        Consumer c=new Consumer(comp);// it is implementing the thread

        //now, will call the start function over the thread
        p.start();
        c.start();

    }
}
