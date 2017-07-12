package posidenpalace.View.Activities;

/**
 * Created by Android on 7/12/2017.
 */

public interface BasePresentor<V extends BaseView> {

    void addView(V view);
    void removeView();
}
