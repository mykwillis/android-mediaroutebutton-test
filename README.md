# android-mediaroutebutton-test
Demo of robolectric working with MediaRouteButton.

This is basically an Android Studio "hello, world" Android application that has Robolectric added to it.

(The branch `workaround` uses a rather tediuous workaround to at least allow non-MediaRouteButton-
related functionality to be tested with Robolectric, by dynamically loading the button instead of
including in the layout.)

Prior to robolectric 4.0, this project would fail with this exception when trying to run the Robolectric test:

android.view.InflateException: XML file build/intermediates/res/merged/debug/layout/activity_main.xml line #-1 (sorry, not yet implemented): XML file build/intermediates/res/merged/debug/layout/activity_main.xml line #-1 (sorry, not yet implemented): Error inflating class android.support.v7.app.MediaRouteButton

Caused by: android.view.InflateException: XML file build/intermediates/res/merged/debug/layout/activity_main.xml line #-1 (sorry, not yet implemented): Error inflating class android.support.v7.app.MediaRouteButton
Caused by: java.lang.reflect.InvocationTargetException
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
	at android.view.LayoutInflater.$$robo$$createView(LayoutInflater.java:645)
	at android.view.LayoutInflater.createView(LayoutInflater.java)
	at android.view.LayoutInflater.$$robo$$createViewFromTag(LayoutInflater.java:787)
	at android.view.LayoutInflater.createViewFromTag(LayoutInflater.java)
	at android.view.LayoutInflater.$$robo$$createViewFromTag(LayoutInflater.java:727)
	at android.view.LayoutInflater.createViewFromTag(LayoutInflater.java)
	at android.view.LayoutInflater.$$robo$$rInflate(LayoutInflater.java:858)
	at android.view.LayoutInflater.rInflate(LayoutInflater.java)
	at android.view.LayoutInflater.$$robo$$rInflateChildren(LayoutInflater.java:821)
	at android.view.LayoutInflater.rInflateChildren(LayoutInflater.java)
	at android.view.LayoutInflater.$$robo$$inflate(LayoutInflater.java:518)
	at android.view.LayoutInflater.inflate(LayoutInflater.java)
	at android.view.LayoutInflater.$$robo$$inflate(LayoutInflater.java:426)
	at android.view.LayoutInflater.inflate(LayoutInflater.java)
	at android.view.LayoutInflater.$$robo$$inflate(LayoutInflater.java:377)
	at android.view.LayoutInflater.inflate(LayoutInflater.java)
	at android.support.v7.app.AppCompatDelegateImplV9.$$robo$$setContentView(AppCompatDelegateImplV9.java:292)
	at android.support.v7.app.AppCompatDelegateImplV9.setContentView(AppCompatDelegateImplV9.java)
	at android.support.v7.app.AppCompatActivity.$$robo$$setContentView(AppCompatActivity.java:140)
	at android.support.v7.app.AppCompatActivity.setContentView(AppCompatActivity.java)
	at mykwillis.com.mediaroutebutton.MainActivity.onCreate(MainActivity.java:11)
	at android.app.Activity.$$robo$$performCreate(Activity.java:6679)
	at android.app.Activity.performCreate(Activity.java)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.robolectric.util.ReflectionHelpers.callInstanceMethod(ReflectionHelpers.java:231)
	at org.robolectric.android.controller.ActivityController$1.run(ActivityController.java:140)
	at org.robolectric.shadows.ShadowLooper.runPaused(ShadowLooper.java:362)
	at org.robolectric.shadows.CoreShadowsAdapter$2.runPaused(CoreShadowsAdapter.java:40)
	at org.robolectric.android.controller.ActivityController.create(ActivityController.java:137)
	at org.robolectric.android.controller.ActivityController.create(ActivityController.java:147)
	at mykwillis.com.mediaroutebutton.MainActivityTest.loadActivity(MainActivityTest.java:14)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.robolectric.RobolectricTestRunner$HelperTestRunner$1.evaluate(RobolectricTestRunner.java:487)
	at org.robolectric.internal.SandboxTestRunner$2.evaluate(SandboxTestRunner.java:209)
	at org.robolectric.internal.SandboxTestRunner.runChild(SandboxTestRunner.java:109)
	at org.robolectric.internal.SandboxTestRunner.runChild(SandboxTestRunner.java:36)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.robolectric.internal.SandboxTestRunner$1.evaluate(SandboxTestRunner.java:63)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:117)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:42)
	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:262)
	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:84)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
Caused by: java.lang.ClassCastException: org.robolectric.res.AttrData cannot be cast to org.robolectric.res.StyleData
	at org.robolectric.shadows.ShadowAssetManager.resolveStyle(ShadowAssetManager.java:617)
	at org.robolectric.shadows.ShadowAssetManager.buildTypedValue(ShadowAssetManager.java:742)
	at org.robolectric.shadows.ShadowAssetManager.attrsToTypedArray(ShadowAssetManager.java:793)
	at org.robolectric.shadows.ShadowResourcesImpl$ShadowThemeImpl.obtainStyledAttributes(ShadowResourcesImpl.java:177)
	at android.content.res.ResourcesImpl$ThemeImpl.obtainStyledAttributes(ResourcesImpl.java)
	at android.content.res.Resources$Theme.obtainStyledAttributes(Resources.java:1440)
	at android.content.Context.obtainStyledAttributes(Context.java:587)
	at android.support.v7.app.MediaRouterThemeHelper.getThemeColor(MediaRouterThemeHelper.java:169)
	at android.support.v7.app.MediaRouterThemeHelper.getControllerColor(MediaRouterThemeHelper.java:94)
	at android.support.v7.app.MediaRouterThemeHelper.createThemedContext(MediaRouterThemeHelper.java:62)
	at android.support.v7.app.MediaRouteButton.<init>(MediaRouteButton.java)
	at android.view.LayoutInflater.createView(LayoutInflater.java:645)
	at android.view.LayoutInflater.createViewFromTag(LayoutInflater.java:787)
	at android.view.LayoutInflater.createViewFromTag(LayoutInflater.java:727)
	at android.view.LayoutInflater.rInflate(LayoutInflater.java:858)
	at android.view.LayoutInflater.rInflateChildren(LayoutInflater.java:821)
	at android.view.LayoutInflater.inflate(LayoutInflater.java:518)
	at android.view.LayoutInflater.inflate(LayoutInflater.java:426)
	at android.view.LayoutInflater.inflate(LayoutInflater.java:377)
	at android.support.v7.app.AppCompatDelegateImplV9.setContentView(AppCompatDelegateImplV9.java:292)
	at android.support.v7.app.AppCompatActivity.setContentView(AppCompatActivity.java:140)
	at mykwillis.com.mediaroutebutton.MainActivity.onCreate(MainActivity.java:11)
	at android.app.Activity.performCreate(Activity.java:6679)
	at org.robolectric.util.ReflectionHelpers.callInstanceMethod(ReflectionHelpers.java:231)
	at org.robolectric.android.controller.ActivityController$1.run(ActivityController.java:140)
	at org.robolectric.shadows.ShadowLooper.runPaused(ShadowLooper.java:362)
	at org.robolectric.shadows.CoreShadowsAdapter$2.runPaused(CoreShadowsAdapter.java:40)
	at org.robolectric.android.controller.ActivityController.create(ActivityController.java:137)
	at org.robolectric.android.controller.ActivityController.create(ActivityController.java:147)
	at mykwillis.com.mediaroutebutton.MainActivityTest.loadActivity(MainActivityTest.java:14)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.robolectric.RobolectricTestRunner$HelperTestRunner$1.evaluate(RobolectricTestRunner.java:487)
	at org.robolectric.internal.SandboxTestRunner$2.evaluate(SandboxTestRunner.java:209)
	at org.robolectric.internal.SandboxTestRunner.runChild(SandboxTestRunner.java:109)
	at org.robolectric.internal.SandboxTestRunner.runChild(SandboxTestRunner.java:36)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.robolectric.internal.SandboxTestRunner$1.evaluate(SandboxTestRunner.java:63)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:117)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:42)
	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:262)
	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:84)
	... 1 more
	
After upgrading to robolectric 4.0 and adding 

    testOptions {
        unitTests {
            includeAndroidResources = true
        }
    }

to build.gradle, and 

	enableUnitTestBinaryResources=true

to gradle.properties, this test runs without issue.


