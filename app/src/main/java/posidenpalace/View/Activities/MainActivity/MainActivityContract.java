package posidenpalace.View.Activities.MainActivity;

import java.util.List;

import posidenpalace.Model.Person;
import posidenpalace.View.Activities.BasePresentor;
import posidenpalace.View.Activities.BaseView;

/**
 * Created by Android on 7/12/2017.
 */

public interface MainActivityContract {
    interface View extends BaseView{

        void setFullName(String fullName);
        void  sendPersonList(List<Person> personList);

    }

    interface  Presenter extends BasePresentor<View>{

        void  getFullName(String firstName, String lastName);
        void addPerson(Person person);
        void sendToNameList();

    }
}
