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

You can either set resource or view itself
```java
listView.setHeaderView(R.layout.header);
```

You can either set resource or view itself 
```java
listView.setFooterView(R.layout.footer);
```

You can set only resource  
```java
listView.setDividerView(R.layout.divider);
```

You can set special listener for the listview
```java
listView.setOnItemClickListener(new SimpleListView.OnItemClickListener() { 
    @Override                                                              
    public void onItemClick(Object item, View view, int position) {        
        //This special listener will return object for you                                                            
    }                                                                      
});
```

At last set adapter
```java
listView.setAdapter(adapter);
```

Refresh the listview                                             
```java
adapter.notifyDataSetChanged();
```
