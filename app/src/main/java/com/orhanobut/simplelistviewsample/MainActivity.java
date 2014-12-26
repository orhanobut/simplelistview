package com.orhanobut.simplelistviewsample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;

import com.orhanobut.simplelistview.SimpleListView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleListView listView = (SimpleListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,
                new String[]{
                        "asdfads",
                        "Babilla",
                        "Orhan Obut",
                        "is great",
                        "awesome"
                }
        );

        listView.setHeaderView(R.layout.header);
        listView.setFooterView(R.layout.footer);
        listView.setDividerView(R.layout.divider);
        listView.setOnItemClickListener(new SimpleListView.OnItemClickListener() {
            @Override
            public void onItemClick(Object item, View view, int position) {
                //
            }
        });
        listView.setAdapter(adapter);

        //It will refresh the listview
        adapter.notifyDataSetChanged();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
