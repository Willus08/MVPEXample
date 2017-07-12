package posidenpalace.View.Activities.Injection.SecondActivity;

import dagger.Module;
import dagger.Provides;
import posidenpalace.View.Activities.SecondActivity.NameListPresenter;

/**
 * Created by Android on 7/12/2017.
 */
@Module
public class NameListModule {
    @Provides
    public NameListPresenter provideNameListPresenter(){
        return new NameListPresenter();
    }
}
