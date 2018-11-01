package mykwillis.com.mediaroutebutton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(shadows = MediaRouteButtonShadow.class)
public class MainActivityTest {
    @Test
    public void loadActivity() {
        MainActivity activity = Robolectric.buildActivity(MainActivity.class).create().get();
    }
}