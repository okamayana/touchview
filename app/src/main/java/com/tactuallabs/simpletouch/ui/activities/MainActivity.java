package com.tactuallabs.simpletouch.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.tactuallabs.simpletouch.R;
import com.tactuallabs.simpletouch.ui.adapters.MenuAdapter;
import com.tactuallabs.simpletouch.ui.adapters.MenuAdapter.MenuItem;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView menuListView = (ListView) findViewById(R.id.menu_list_view);
        MenuAdapter adapter = new MenuAdapter(MainActivity.this, R.layout.list_item_menu,
                R.id.menu_item_label);
        menuListView.setAdapter(adapter);
        menuListView.setOnItemClickListener(MainActivity.this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        MenuItem item = (MenuItem) adapterView.getItemAtPosition(position);

        switch (item) {
            case TOUCH_VIEW:
                TouchViewActivity.start(MainActivity.this);
                break;

            default:
                throw new IllegalStateException("Invalid menu item selected: " + item);
        }
    }
}
