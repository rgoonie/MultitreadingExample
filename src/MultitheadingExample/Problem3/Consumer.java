package MultitheadingExample.Problem3;

import java.util.Queue;

public class Consumer implements Runnable {

    private Producer myProducer;

    public Consumer(Producer producer){
        myProducer = producer;
    }

    public void consume() throws Exception{
        Queue<Integer> market = myProducer.getProduce();

        synchronized (myProducer){
            while(market.isEmpty()){
                this.wait();
            }
        }

        market.poll();
        System.out.println("Consumer consumed something...");
    }

    @Override
    public void run() {

    }
}
