package com.aliuzzi.notion;

import android.content.Context;
import android.database.DataSetObserver;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.aliuzzi.notion.api.models.DatabaseQuery;
import com.aliuzzi.notion.api.models.MultiSelect;
import com.aliuzzi.notion.api.models.Result;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

public class DatabaseQueryArrayAdapter implements ListAdapter {

    private List<Result> results;
    private LayoutInflater layoutInflater;
    public DatabaseQueryArrayAdapter(@NonNull Context context, List<Result> results) {
        this.results = results;
        layoutInflater = LayoutInflater.from(context);
//        List<String> names = new ArrayList<>();
//        DatabaseQuery databaseQuery = response.body();
//        for(Result result: databaseQuery.results){
//
//            String name;
//            try {
//                name = result.properties.name.title.get(0).text.content;
//            } catch (Exception e){
//                name = "(No title)";
//            }
//            names.add(name);
//
//        }
//    }
    }

    @Override
    public boolean areAllItemsEnabled() {
        return true;
    }

    @Override
    public boolean isEnabled(int position) {
        return true;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return results.size();
    }

    @Override
    public Object getItem(int position) {
        return results.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View view;

        if (convertView == null) {
            view = layoutInflater.inflate(R.layout.list_view_row, parent, false);
        } else {
            view = convertView;
        }

        TextView textViewName = view.findViewById(R.id.database_name);
        TextView textViewTags = view.findViewById(R.id.database_tags);

        String name;
            try {
                name = results.get(position).properties.name.title.get(0).text.content;
            } catch (Exception e){
                name = "(No title)";
            }
        textViewName.setText(name);

        StringBuilder tags = new StringBuilder();
        List<MultiSelect> multiSelects = results.get(position).properties.tags.multiSelect;
        if (multiSelects.isEmpty()) {
            tags.append("(No tags)");
        } else {

            for (int i = 0; i < multiSelects.size(); i++) {
                if (i < multiSelects.size() - 1){
                    tags.append(multiSelects.get(i).name + ", ");
                } else {
                    tags.append(multiSelects.get(i).name);
                }
            }

        }


        textViewName.setText(name);
        textViewTags.setText(tags);
        return view;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return results.isEmpty();
    }
}
