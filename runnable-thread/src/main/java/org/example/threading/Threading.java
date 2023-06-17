package org.example.threading;

public class Threading extends RunnableThreading{
    public static void main(String[] args) {
        RunnableThreading obj=new RunnableThreading(); // it is the object, our created class
        Thread obj_t=new Thread(obj); //passing our object into thread class
        obj_t.start(); // calling the start function

        ClassThreading obj_t1=new ClassThreading(); // it is the another object our class which is extends Thread class
        obj_t1.start();

    }
}
