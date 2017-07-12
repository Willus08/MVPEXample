package posidenpalace.View.Activities.SecondActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import posidenpalace.View.Activities.Injection.SecondActivity.DaggerNameListComponent;
import posidenpalace.com.mvpexample.R;

public class NameList extends AppCompatActivity implements NameListContract.View {

    @Inject NameListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_list);
        setUpDaggerComponent();
        presenter.addView(this);
        Intent intent = getIntent();
        presenter.showList(intent);

    }

    private void setUpDaggerComponent(){
        DaggerNameListComponent.create().inject(this);
    }
    @Override
    public void showError(String error) {

    }
}
