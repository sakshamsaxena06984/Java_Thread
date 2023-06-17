package org.example.threading;

public class ThreadOperation {
    public static void main(String[] args) {
        System.out.println("Program Started");

        Thread t = Thread.currentThread(); // getting the current running thread
        t.setName("main_new_name");
        try{
            t.sleep(50);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("current running thread is : "+t.getName()); // getting the current running thread
        System.out.println("getting the current running thread id : "+t.getId());

        System.out.println("Program Ended");
    }
}
