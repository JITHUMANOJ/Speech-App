
# Speech - Android App




<img src="https://user-images.githubusercontent.com/59398434/115166214-f4021500-a07f-11eb-8469-e44e85b4fb4b.jpeg" align="left"
width="200" hspace="10" vspace="10">



Speech app is a picture based AAC (Augmentative and alternative communication) application that empowers children and adults with complex communication needs to express themselves.


Unlike other services, speech app is free and open source.



## Overview
The speech app allows the users to promote communication skills and express their thoughts. The app is developed based on picture exchange communication system where symbols and images are used to represent various food, activities and emotions. The app also contains an emergency button which can be used in case of any emergencies. Communication is not just limited to conveying need but also expressing emotions and thoughts. By using the speech app, the user could easily share their feeling


## Prerequisites

Make sure you have installed the following prerequisites on your development meachine:

* Android Studio. 

* Git - [Download & Install Git](https://git-scm.com/downloads). OSX and Linux machines     typically have this already installed.

* Android Build tools v28+.

* Android phone 7.0 and up.




## Installation Instructions

* Make sure you've installed the Android 7.1.1 SDK and upgraded to the latest version of Android Studio

* Make sure you've updated all support repository and in the Android SDK manager

* See the configuration and clone the environment into android studio using the following link:

   

```
  https://github.com/JITHUMANOJ/Speech-App.git

```


------------

## Operating Instructions

Permission for making phone calls are included by defaul as we need to make phone call requests:

```
  <uses-permission android:name="android.permission.CALL_PHONE" />

```



## Manifest

## Dependencies Used


```
    implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    implementation 'androidx.core:core-ktx:1.3.2'
    implementation 'androidx.appcompat:appcompat:1.2.0'
    implementation 'com.google.android.material:material:1.3.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
    
```

## Plugins

* [CodeGlance](https://plugins.jetbrains.com/plugin/7275-codeglance)

## Generating signed APK
From Android Studio:

* Build menu 
* Generate Signed APK...
* Fill in the keystore information (you only need to do this once manually and then let Android Studio remember it)





## Troubleshooting Tips




--------------------



## Built with

* Kotlin - The programming language used
* Android Studio - Developing environment used
* No external libraries were used in this project

## Authors


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
