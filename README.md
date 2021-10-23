# Glide library for Android images

Glide library handles large image files well, without crashes.

Earlier tests showed some images caused an app to crash when loaded with [Picasso](https://github.com/square/picasso/issues/2046).

Glide can load images via a URL or embedded drawable. If you use a URL, you must include permissions in AndroidManifest.xml:

```
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```

Here's a screenshot of the app showing an embedded image. You can cycle through three screens of images in the app. Two are embedded - one png and one jpg - and one is from a URL.

<img src="https://github.com/fullStackOasis/android-glide-large-bitmap/raw/main/screen.png"/>
