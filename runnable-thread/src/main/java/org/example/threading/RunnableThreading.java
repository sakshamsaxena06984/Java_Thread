package org.example.threading;

public class RunnableThreading implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("value of thread i : "+i);
            try {
                Thread.sleep(3000); // sleeping method
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
