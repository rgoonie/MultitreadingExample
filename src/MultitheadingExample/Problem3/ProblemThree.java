package MultitheadingExample.Problem3;

public class ProblemThree {

    public static void main(String[] args){
        Consumer theConsumer = new Consumer( null );
        Producer theProducer = new Producer( 10, theConsumer);
        theConsumer.setMyProducer(theProducer);

        Thread producer = new Thread(theProducer);
        Thread consumer = new Thread(theConsumer);

        producer.start();
        consumer.start();
    }

}
