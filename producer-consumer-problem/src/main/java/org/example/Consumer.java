package org.example;

public class Consumer extends Thread{

    Company c;
    Consumer(Company c){
        this.c=c;
    }

    public void run(){
        while(true){
            try{
                this.c.consume_item();
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
