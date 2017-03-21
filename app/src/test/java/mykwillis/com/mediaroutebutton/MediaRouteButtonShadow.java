package mykwillis.com.mediaroutebutton;

import android.content.Context;
import android.util.AttributeSet;

import org.robolectric.annotation.Implements;
import org.robolectric.shadows.ShadowView;

@Implements(android.support.v7.app.MediaRouteButton.class)
public class MediaRouteButtonShadow extends ShadowView {
    public void __constructor__(Context context, AttributeSet attributeSet, int defStyle) {
    }
}
