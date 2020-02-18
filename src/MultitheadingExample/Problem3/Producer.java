package MultitheadingExample.Problem3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {

    private Queue<Integer> produce = new LinkedList<>();
    private Random random = new Random();
    private Consumer consumer;
    private int capacity;

    public Producer(int capacity, Consumer consumer){
        this.capacity = capacity;
        this.consumer = consumer;
    }

    public Queue<Integer> getProduce(){ return produce; }

    public void produceSomething() throws Exception{

        synchronized (consumer){
            while(produce.size() == capacity){
                this.wait();
            }
        }

        produce.add( random.nextInt() );
    }

    @Override
    public void run() {

        try { while(true) {produceSomething();} }
        catch(Exception e) {
            System.out.println("Shit when down hill...");
            System.exit(0);
        }

    }
}