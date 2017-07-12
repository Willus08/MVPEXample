package posidenpalace.View.Activities.MainActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import posidenpalace.Model.Person;
import posidenpalace.View.Activities.Injection.MainActivity.DaggerMainActivityComponent;
import posidenpalace.View.Activities.SecondActivity.NameList;
import posidenpalace.com.mvpexample.R;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    @Inject MainActivityPresenter presenter;
    EditText first;
    EditText last;
    TextView full;
    String FirstName;
    String LastName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (EditText) findViewById(R.id.etFirst);
        last = (EditText) findViewById(R.id.etLast);
        full = (TextView) findViewById(R.id.tvFullName);

        setUpDaggerComponent();

        presenter.addView(this);
    }

    private void setUpDaggerComponent(){
        DaggerMainActivityComponent.create().inject(this);
    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void setFullName(String fullName) {
        full.setText(fullName);
    }

    @Override
    public void sendPersonList(List<Person> personList) {
        Intent intent = new Intent(this, NameList.class);
        intent.putExtra("list", (Serializable) personList);
        startActivity(intent);
    }

    public void Save(View view) {
        String firstName = first.getText().toString();
        String lastName = last.getText().toString();
        presenter.addPerson(new Person(firstName,lastName));
        Toast.makeText(this, "Person Added", Toast.LENGTH_SHORT).show();
    }

    public void display(View view) {
        String firstName = first.getText().toString();
        String lastName = last.getText().toString();
        presenter.getFullName(firstName,lastName);
    }

    public void Show(View view) {
        presenter.sendToNameList();
    }
}
