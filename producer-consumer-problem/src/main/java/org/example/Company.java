package org.example;

public class Company {
    int n;
    boolean f=false;

    /**
     * logic : if f is FALSE --> producer produce the records
     *         if f is TRUE  --> consumer consume the records
     * @param n
     */

    synchronized public void produce_item(int n) throws InterruptedException {
        if(f){
            wait();
        }
        this.n=n;
        System.out.println("Produced : "+this.n);
        f=true;
        notify();
    }
    //use for consuming notification
    synchronized public int consume_item() throws InterruptedException {
        if(!f){
            wait();
        }
        System.out.println("Consumed : "+this.n);
        f=false;
        notify();
        return this.n;
    }
}
