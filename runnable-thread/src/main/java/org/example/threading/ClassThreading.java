package org.example.threading;

public class ClassThreading extends Thread{
    public void run(){
        for(int i=10;i>=1;i--){
            System.out.println("thread class : "+i);
            try {
                sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
