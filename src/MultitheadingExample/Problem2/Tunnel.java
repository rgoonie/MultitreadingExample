package MultitheadingExample.Problem2;

public class Tunnel {

    private Person[] people;

    public Tunnel(int n){
        people = new Person[n];

        for(int i = 0; i < n; i++){
            people[i] = new Person( getRandomName() );
        }

    }

}
