[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-simplelistview-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1544)

simplelistview
==============

Android simple listview by using linearlayout. Behavior is the same except no scrollable, thus you can use it freely in scrollview. It is very basic implementation, you should not use for the huge list.

###Gradle
```groovy
repositories {
    maven { url "https://oss.sonatype.org/content/repositories/snapshots/"}
}
dependencies {
    compile 'com.orhanobut:simplelistview:1.0.0-SNAPSHOT@aar'
}
```

###Usage
Either define in xml or dynamically.
xml sample
```xml
<com.orhanobut.simplelistview.SimpleListView
    android:id="@+id/list"                     
    android:layout_width="match_parent"        
    android:layout_height="wrap_content"/>
```

##### Set header
```java
listView.setHeaderView(R.layout.header);
```
or 
```java
listView.setHeaderView(view);
```

##### Set footer
```java
listView.setFooterView(R.layout.footer);
```
or
```java
listView.setFooterView(view);
```

##### Set divider
```java
listView.setDividerView(R.layout.divider);
```

##### Set item click Listener
```java
listView.setOnItemClickListener(new SimpleListView.OnItemClickListener() { 
    @Override                                                              
    public void onItemClick(Object item, View view, int position) {        
        //This special listener will return object for you                                                            
    }                                                                      
});
```

##### Set adapter
```java
listView.setAdapter(adapter);
```

##### Refresh the listview                                             
```java
adapter.notifyDataSetChanged();
```

###License
<pre>
Copyright 2014 Orhan Obut

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
</pre>
