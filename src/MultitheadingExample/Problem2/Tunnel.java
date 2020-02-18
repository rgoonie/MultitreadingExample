package MultitheadingExample.Problem2;

import java.util.Arrays;

public class Tunnel {

    private Person[] people;

    public Tunnel(int nameLength){
        people = new Person[10];

        for(int i = 0; i < 10; i++){
            people[i] = new Person( getRandomName(nameLength) );
        }

        setPriorities();
    }

    public void runThroughTunnel(){
        for(Person p : people)
            p.start();
    }

    private void setPriorities(){
        Arrays.sort(people);
        int priority = Thread.MAX_PRIORITY;
        for(Person p : people)
            p.setPriority(priority--);
    }

    private String getRandomName(int len){

        String name = "";
        for(int i = 0; i < len; i++)
            name += (char)(Math.random()*26 + 65);

        return name;

    }

}
