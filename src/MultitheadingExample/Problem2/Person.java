package MultitheadingExample.Problem2;

public class Person extends Thread implements Comparable<Person>{

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getPersonName(){
        return name;
    }

    @Override
    public int compareTo(Person p){
        return name.compareTo( p.getPersonName() );
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
