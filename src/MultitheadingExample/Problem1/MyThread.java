package MultitheadingExample.Problem1;

public class MyThread extends Thread {

    private int threadNum;
    private int sleepTime;

    public MyThread(int num){
        threadNum = num;
        sleepTime = (int)( (Math.random() * 10) + 1);
    }

    @Override
    public void run() {

        try {
            Thread.sleep(sleepTime * 100);
            System.out.println("Thread Number " + threadNum + " slept for " + sleepTime + " seconds.");
        }
        catch(Exception e) { System.out.println("A Thread failed..."); }

    }
}
