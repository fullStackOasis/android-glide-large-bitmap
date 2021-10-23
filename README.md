# Glide library for Android images

Glide library handles large image files well, without crashes.

Earlier tests showed some images caused an app to crash when loaded with [Picasso](https://github.com/square/picasso/issues/2046).

Glide can load images via a URL or embedded drawable. If you use a URL, you must include permissions in AndroidManifest.xml:

```
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```

