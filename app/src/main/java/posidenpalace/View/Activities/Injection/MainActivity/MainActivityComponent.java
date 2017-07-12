package posidenpalace.View.Activities.Injection.MainActivity;

import posidenpalace.View.Activities.MainActivity.MainActivity;
import dagger.Component;

/**
 * Created by Android on 7/12/2017.
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);



}
