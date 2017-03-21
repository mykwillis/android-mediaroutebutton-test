package mykwillis.com.mediaroutebutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    /**
     * Allow derived class to disable display of MediaRouteButton.
     *
     * This is necessary to get Robolectric to work; it blows up if we try to
     * inflate the MediaRouteButton.
     */
    protected boolean showMediaRouteButton() {
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (showMediaRouteButton()) {
            ViewGroup placeholder = (ViewGroup) findViewById(R.id.media_route_placeholder);
            getLayoutInflater().inflate(
                    R.layout.activity_main_media_route_button,
                    placeholder);
        }
    }
}
