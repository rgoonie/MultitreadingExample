package MultitheadingExample.Problem2;

public class Tunnel {

    private Person[] people;

    public Tunnel(int numPeople, int nameLength){
        people = new Person[numPeople];

        for(int i = 0; i < numPeople; i++){
            people[i] = new Person( getRandomName(nameLength) );
        }

    }

    private String getRandomName(int len){

        String name = "";
        for(int i = 0; i < len; i++)
            name += (char)(Math.random()*26 + 65);

        return name;

    }

}
