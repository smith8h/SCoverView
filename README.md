# SCoverView

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
        app:textPadding="20dp" />
```

java codes
```java
        b.scoverview.setImageResource(...);
        b.scoverview.setImageDrawable(...);
        b.scoverview.setImageBitmap(...);
        b.scoverview.setTextShadeColor(Color.CYAN);
        b.scoverview.setTextColor(Color.BLACK);
        b.scoverview.setText("Hi I'm Hussein Smith, I'm the developer of this library!");
        b.scoveview.setText(int resource)
        b.scoverview.setTextPadding(12);
        b.scoverview.setCorners(50);
```