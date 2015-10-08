package com.tactuallabs.simpletouch.ui.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tactuallabs.simpletouch.R;

/**
 * Simple adapter used in MainActivity to display a menu list of whiteboards that the user can
 * choose from.
 */
public class MenuAdapter extends ArrayAdapter<MenuAdapter.MenuItem> {

    public enum MenuItem {
        TOUCH_VIEW(R.string.menu_touch_view);

        final int resId;

        MenuItem(int resId) {
            this.resId = resId;
        }
    }

    public MenuAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId, MenuItem.values());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(getContext(), R.layout.list_item_menu, null);
        }

        return setView(convertView, getItem(position));
    }

    private View setView(View convertView, MenuItem item) {
        TextView labelView = (TextView) convertView.findViewById(R.id.menu_item_label);
        labelView.setText(item.resId);

        return convertView;
    }
}