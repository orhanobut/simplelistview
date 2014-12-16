simplelistview
==============

Android simple listview by using linearlayout. Behavior is the same except no scrollable, thus you can use it freely in scrollview. It is very basic implementation, you should not use for the huge list.

###Gradle
<pre>
repositories {
    maven { url "https://oss.sonatype.org/content/repositories/snapshots/"}
}
dependencies {
    compile 'com.github.nr4bt:simplelistview:1.0.0-SNAPSHOT@aar'
}
</pre>

###Usage
Either define in xml or dynamically.
xml sample
<pre>
com.github.nr4bt.simplelistview.SimpleListView
    android:id="@+id/list"                     
    android:layout_width="match_parent"        
    android:layout_height="wrap_content"
</pre>

Initialize the listview
<pre>
listView.setHeaderView(R.layout.header);  //You can either set resource or view itself                                 
listView.setFooterView(R.layout.footer);  //You can either set resource or view itself                                   
listView.setDividerView(R.layout.divider);  //You can set only resource                             
listView.setOnItemClickListener(new SimpleListView.OnItemClickListener() { 
    @Override                                                              
    public void onItemClick(Object item, View view, int position) {        
        //This special listener will return object for you                                                            
    }                                                                      
});                                                                        
listView.setAdapter(adapter); // At last set adapter                                              
                                                                           
//It will refresh the listview                                             
adapter.notifyDataSetChanged();                                            
</pre>
