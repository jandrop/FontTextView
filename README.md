![alt text](https://raw.githubusercontent.com/jandrop/FontTextView/master/art/sample.png)

FontTextView Sample
===================================

## How to use

### 1.- Gradle Dependency

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```groovy
gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

### 2.- Configuring your Project Dependencies
Add the library dependency to your build.gradle file.

```groovy
dependencies {
    ...
    compile 'com.github.jandrop:jandrop:FontTextView:1.0'
}
```
### 3.- Example of use:

Add into your assets/fonts your favourites fonts
then you can add the textview into your xml as:
```groovy
<es.atrapandocucarachas.fonttextview.FontTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:textSize="48sp"
        app:customFont="capture.ttf"
        android:layout_centerVertical="true"
        android:layout_centerHorizontal="true" />
```

See the sample project for more info.

## License

Copyright Alejandro Platas 2016

Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
