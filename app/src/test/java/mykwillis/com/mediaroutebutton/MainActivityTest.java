package mykwillis.com.mediaroutebutton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, shadows = MediaRouteButtonShadow.class)
public class MainActivityTest {
    @Test
    public void loadActivity() {
        MainActivity activity = Robolectric.buildActivity(MainActivityNoCast.class).create().get();
    }
}

/**
 * Override of our MainActivity that disables load of MediaRouteButton.
 */
class MainActivityNoCast extends MainActivity {
    @Override
    protected boolean showMediaRouteButton() {
        return false;
    }
}