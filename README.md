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

You can either set resource or view itself
<pre>listView.setHeaderView(R.layout.header);</pre>     

You can either set resource or view itself 
<pre>listView.setFooterView(R.layout.footer);</pre>

You can set only resource  
<pre>listView.setDividerView(R.layout.divider);</pre>  

You can set special listener for the listview
<pre>listView.setOnItemClickListener(new SimpleListView.OnItemClickListener() { 
    @Override                                                              
    public void onItemClick(Object item, View view, int position) {        
        //This special listener will return object for you                                                            
    }                                                                      
});</pre>         

At last set adapter
<pre>listView.setAdapter(adapter);</pre>                                               
                                                                           
Refresh the listview                                             
<pre>adapter.notifyDataSetChanged();</pre>
