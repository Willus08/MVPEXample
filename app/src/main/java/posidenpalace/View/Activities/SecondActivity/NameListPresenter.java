package posidenpalace.View.Activities.SecondActivity;

import android.content.Intent;
import android.util.Log;

import java.util.List;

import posidenpalace.Model.Person;

import static android.content.ContentValues.TAG;

/**
 * Created by Android on 7/12/2017.
 */

public class NameListPresenter implements NameListContract.Presenter {

    NameListContract.View view;
    @Override
    public void addView(NameListContract.View view) {
        this.view = view;
    }

    @Override
    public void removeView() {
        this.view = null;
    }

    @Override
    public void showList(Intent intent) {
        List<Person> people = (List<Person>) intent.getSerializableExtra("list");
        for (int i = 0; i <people.size() ; i++) {
            Log.d(TAG, "showList: " + people.get(i).getFirstName());

        }

    }
}
