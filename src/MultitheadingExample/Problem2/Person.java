package MultitheadingExample.Problem2;

public class Person extends Thread {

    private String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public void run() {

        try{
            Thread.sleep(5000);
            System.out.println(name + " has crossed the tunnel...");
        }
        catch(Exception e) { System.out.println("Thread failed..."); }

    }
}
