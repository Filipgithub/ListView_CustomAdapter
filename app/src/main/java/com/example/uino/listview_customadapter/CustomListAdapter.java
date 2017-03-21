package com.example.uino.listview_customadapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by UINO on 3/21/2017.
 */

public class CustomListAdapter extends BaseAdapter {

private ArrayList<Person> listData;
private Context mContext;

public CustomListAdapter(Context aContext, ArrayList<Person> listData) {
        this.listData = listData;
        mContext = aContext;
        }

@Override
public int getCount() {
        return listData.size();
        }

@Override
public Object getItem(int position) {
        return listData.get(position);
        }

@Override
public long getItemId(int position) {
        return position;
        }

@Override
public View getView(int position, View view, ViewGroup viewGroup) {

final Person person = listData.get(position);

        View customView = View.inflate(mContext, R.layout.list_row_layout, null);

        TextView firstName = (TextView) customView.findViewById(R.id.first_name);
        TextView lastName = (TextView) customView.findViewById(R.id.last_name);
        CheckBox checkBox = (CheckBox) customView.findViewById(R.id.checkBox);

        firstName.setText(person.getFirstName());
        lastName.setText(person.getLastName());
        if (position % 2 == 0) checkBox.setChecked(true);


        customView.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Intent intent = new Intent(mContext, Main2Activity.class);
        intent.putExtra("extra", person);

        mContext.startActivity(intent);
        }
        });

        return customView;
        }
        }

