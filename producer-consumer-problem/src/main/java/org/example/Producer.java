package org.example;

public class Producer extends Thread{
    Company c;
    Producer(Company c){
        this.c=c;
    }

    //run function of thread
    public void run(){
        int i=1;
        while (true){
            try{
                this.c.produce_item(i);
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
