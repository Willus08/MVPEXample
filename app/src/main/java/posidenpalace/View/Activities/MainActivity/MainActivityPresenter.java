package posidenpalace.View.Activities.MainActivity;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import posidenpalace.Model.Person;

/**
 * Created by Android on 7/12/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {
    List<Person> people = new ArrayList<>();

    MainActivityContract.View view;

    @Override
    public void addView(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void removeView() {
        this.view = null;
    }

    @Override
    public void getFullName(String firstName, String lastName) {
        view.setFullName(firstName + " " + lastName);
    }

    @Override
    public void addPerson(Person person) {
        people.add(person);
       ;

    }

    @Override
    public void sendToNameList() {
        view.sendPersonList(people);
    }


}
