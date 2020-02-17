package MultitheadingExample.Problem1;

public class ProblemOne {

    public static void main(String[] args){

        int n = 5;

        MyThread[] allThreads = new MyThread[n];

        for(int i = 0; i < n; i++) {
            allThreads[i] = new MyThread(i);
            allThreads[i].start();
        }

    }

}
