# SCoverView

Add it in your root build.gradle at the end of repositories:
```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency
```gradle
	dependencies {
	        implementation 'com.github.smith8h:SCoverView:Tag'
	}
```

xml code
```xml
<smith.lib.views.cover.SCoverView
        android:id="@+id/scoverview"
        android:layout_width="match_parent"
        android:layout_height="300dp"
        android:onClick="message"
        app:corners="20dp"
        app:image="@drawable/img"
        app:text="a simple text displayed on scover view"
        app:textColor="@color/white"
        app:textShadeColor="@color/black"
        app:textSize="12sp"
        app:textVisibility="visible"
        app:textPadding="20dp" />
```
visible or gone 

java codes
```java
        b.scoverview.setImageResource(...);
        b.scoverview.setImageDrawable(...);
        b.scoverview.setImageBitmap(...);
        b.scoverview.setTextShadeColor(Color.CYAN);
        b.scoverview.setTextColor(Color.BLACK);
        b.scoverview.setText("Hi I'm Hussein Smith, I'm the developer of this library!");
        b.scoverview.setText(int resource);
        b.scoverview.setTextPadding(12);
        scoverview.setTextVisibility(Visibility.VISIBLE); // GONE
        b.scoverview.setCorners(50);
```