# SCoverView

<p align="center">
    <!-- Latest release -->
    <img src="https://img.shields.io/github/v/release/smith8h/SCoverView?include_prereleases&amp;label=latest%20release" alt="Latest release"/>
    <!-- Build and test -->
    <img src="https://github.com/smith8h/SCoverView/actions/workflows/build.yml/badge.svg" alt="Builds and tests"/>
    <!-- JitPack release -->
    <a href="https://jitpack.io/#smith8h/SCoverView">
        <img src="https://jitpack.io/v/smith8h/SCoverView.svg" />
    </a>
    <!-- Stability -->
    <img src="https://img.shields.io/badge/stability-stable-green.svg" alt="stability" />
    <!-- minSDK -->
    <img src="https://img.shields.io/badge/minSDK-21-f39f37" alt="minsdk" />
    <!-- stable version -->
    <img src="https://img.shields.io/badge/stable_version-1.0-blue" alt="stable"/>
    <!-- repo size -->
    <img src="https://img.shields.io/github/repo-size/smith8h/scoverview" alt="size"/>
</p>

</br>

Beautiful custom cover view libraey for android.

## Setup

> **Step 1.** Add it in your root build.gradle at the end of repositories:

```gradle
 allprojects {
  repositories {
   ...
   maven { url 'https://jitpack.io' }
  }
 }
```

> **Step 2.** Add the dependency

```gradle
 dependencies {
         implementation 'com.github.smith8h:SCoverView:1.0'
 }
```

## Documentation

**XML Attributes**:

```xml
<smith.lib.views.cover.SCoverView
        android:id="@+id/scoverview"
        app:corners="15dp"
        app:image="@drawable/img"
        app:text="@string/text"
        app:textColor="@android:color/white"
        app:textShadeColor="@android:color/black"
        app:textSize="10sp"
        app:textVisibility="visible"
        app:textPadding="12dp" />
```

You can set text visibility to `visible` or `gone`.

**JAVA codes**:

```java
        scoverview.setImageResource(...); // R.drawable.img
        scoverview.setImageDrawable(...); // Drawable
        scoverview.setImageBitmap(...); // Bitmap
        scoverview.setTextShadeColor(Color.CYAN); // int color or resource using getColor(R.color.name)
        scoverview.setTextColor(Color.BLACK); // same as textShadeColor()
        scoverview.setText("Hi I'm Hussein Smith"); // string or resource R.string.text
        scoverview.setTextPadding(12); // any value here will be converted automatically to its relative dp size depending on device's screen density
        scoverview.setTextVisibility(Visibility.VISIBLE); // VISIBLE or GONE
        scoverview.setCorners(50); // any value here will be converted automatically to its relative dp size depending on device's screen density
```

## Donations

> If you would like to support this project's further development, the creator of this projects or the continuous maintenance of the project **feel free to donate**.
Your donation is highly appreciated. Thank you!

</br>

You can **choose what you want to donate**, all donations are awesome!

</br>

[![PayPal](https://img.shields.io/badge/PayPal-00457C?style=for-the-badge&logo=paypal&logoColor=white)](https://www.paypal.me/husseinshakir)

</br>

<p align="center">
  <img src="https://raw.githubusercontent.com/smith8h/smith8h/main/20221103_150053.png" style="width: 38%;"/>
  </br><b>With :heart:</b>
</p>
