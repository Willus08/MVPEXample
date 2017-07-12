package posidenpalace.View.Activities.Injection.SecondActivity;

import dagger.Component;
import posidenpalace.View.Activities.SecondActivity.NameList;

/**
 * Created by Android on 7/12/2017.
 */

@Component(modules = NameListModule.class)
public interface NameListComponent {
    void inject(NameList nameList);
}
