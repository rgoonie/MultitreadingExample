package MultitheadingExample.Problem1;

public class ProblemOne {

    public static void main(String[] args){

        int n = 5;

        Thread[] allThreads = new Thread[n];

        for(int i = 0; i < n; i++)
            allThreads[i] = new Thread();

    }

}
