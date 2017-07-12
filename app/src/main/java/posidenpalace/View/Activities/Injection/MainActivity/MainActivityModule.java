package posidenpalace.View.Activities.Injection.MainActivity;

import posidenpalace.View.Activities.MainActivity.MainActivityPresenter;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Android on 7/12/2017.
 */
@Module
public class MainActivityModule {

    @Provides
   public MainActivityPresenter provideMainActivityPresenter(){
        return new MainActivityPresenter();
    }
}
