package posidenpalace.View.Activities.SecondActivity;

import android.content.Intent;

import java.util.List;

import posidenpalace.Model.Person;
import posidenpalace.View.Activities.BasePresentor;
import posidenpalace.View.Activities.BaseView;

/**
 * Created by Android on 7/12/2017.
 */

public interface NameListContract {
    interface View extends BaseView{
        void setUpRecyclerView(List<Person> people);
    }

    interface  Presenter extends BasePresentor<View>{

        void showList(Intent intent);

    }
}
