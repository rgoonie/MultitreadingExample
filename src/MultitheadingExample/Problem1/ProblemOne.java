package MultitheadingExample.Problem1;

public class ProblemOne {

    private Thread[] allThreads;

    public ProblemOne(int n){

        allThreads = new Thread[n];

        for(int i = 0; i < n; i++)
            allThreads[i] = new Thread();

    }

}
