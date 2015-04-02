[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-simplelistview-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1544)     [![API](https://img.shields.io/badge/API-10%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=10) [![](https://img.shields.io/badge/AndroidWeekly-%23144-blue.svg)](http://androidweekly.net/issues/issue-144)

simplelistview
==============

Android simple listview by using linearlayout. 

#### The problem
- You need to add a few items and you don't want the scroll feature
- You have a scrollview and you want to show a few items in the list as fully expanded

###Gradle
```groovy
compile 'com.orhanobut:simplelistview:1.3@aar'
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

#### You might also like
- [Logger](https://github.com/orhanobut/logger) Simple,pretty and advanced logger
- [Hawk](https://github.com/orhanobut/hawk) Secure simple key-value storage
- [Wasp](https://github.com/orhanobut/wasp) All-in-one network solution
- [Bee](https://github.com/orhanobut/bee) QA/Debug tool
- [DialogPlus](https://github.com/orhanobut/dialogplus) Easy,simple dialog solution

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
