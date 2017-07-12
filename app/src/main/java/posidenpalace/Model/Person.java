package posidenpalace.Model;

import java.io.Serializable;

/**
 * Created by Android on 7/12/2017.
 */

public class Person implements Serializable {
    String firstName;
    String LastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
