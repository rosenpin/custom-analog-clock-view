# Custom Analog Clock View

[![JitPack](https://jitpack.io/v/rosenpin/custom-analog-clock-view.svg)](https://jitpack.io/#rosenpin/custom-analog-clock-view)
[![Download](https://api.bintray.com/packages/rosenpin/maven/custom-analog-clock-view/images/download.svg) ](https://bintray.com/rosenpin/maven/custom-analog-clock-view/_latestVersion)

Based on [xxv](https://github.com/xxv)/[24AnalogWidget](https://github.com/xxv/24hAnalogWidget)

This is a super easy to implement and highly customizable analog clock library

##Dependency
Add this to your app build.gradle file
```` gradle
dependencies {
    compile 'com.tomerrosenfeld.customanalogclockview:custom-analog-clock-view:1.02'
}
````


##How to use
In your layout:
```xml
<com.tomerrosenfeld.customanalogclockview.CustomAnalogClock
        android:id="@+id/analog_clock"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
````

In your activity:
```java
CustomAnalogClock customAnalogClock = (CustomAnalogClock) findViewById(R.id.analog_clock);
customAnalogClock.setAutoUpdate(true);
````

####And you're basically done!

 Default clock 
<img src="http://i.imgur.com/mb08zMF.png" alt="Drawing" width="400" />

#Customization
You can completely change the look of the widget by using the init function:
```java 
init(Context context, @DrawableRes int watchFace, @DrawableRes int hourHand, @DrawableRes int minuteHand, int alpha, boolean is24, boolean hourOnTop)
``` 
So for example:
````java 
customAnalogClock.init(MainActivity.this, R.drawable.default_face, R.drawable.default_hour_hand, R.drawable.default_minute_hand, 0, false, false);
````

In this example, we are creating an analog clock with custom drawables, the background is `R.drawable.default_face`, the hour hand is `R.drawable.default_hour_hand` and the minute hand is `R.drawable.default_minute_hand`.

In addition to that, we chose to keep the clock 12H, like a standard clock, if you want to make it 24H, pass `true` for is24.

The alpha parameter sets the opacity of the hour hand, set it to 0 to make it completely visible (alpha can vary between 1-254).

The hourOnTop parameter determines the hour hand placement. If set to true, the hour hand will appear on top of the minutes hand, otherwise, the minute hand will show up on top.

I suggest that you base your clock drawables on my default ones:

[The Face](/custom-analog-clock-view/src/main/res/drawable-xhdpi/default_face.png)

[The Hour Hand](/custom-analog-clock-view/src/main/res/drawable-xhdpi/default_hour_hand.png)

[The Minute Hand](/custom-analog-clock-view/src/main/res/drawable-xhdpi/default_minute_hand.png)

Using this library I was easily able to create these analog clock widgets:

| Pebble Theme | S7 Theme | Default |
|:-:|:-:|:-:|
| ![Pebble Theme](http://i.imgur.com/w3jfrsT.png) | ![S7 Theme](http://i.imgur.com/1vjYhFd.png) | ![Flat style](http://i.imgur.com/AB2EIAD.png) |

## Licensing
Custom Analog Clock View is licensed under the [GNU v3 Public License.](LICENSE)

