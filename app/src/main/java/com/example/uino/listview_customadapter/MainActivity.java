package com.example.uino.listview_customadapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        final String[] values = new String[]{"Suzana",
                "Sasa",
                "Mirjana"
        };


        final ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < values.length; i++)
            persons.add(new Person(values[i]));

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

       /* ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values); */
        CustomListAdapter customListAdapter = new CustomListAdapter(this, persons);
        final Intent intent = new Intent(this, Main2Activity.class);
        // Assign adapter to ListView
        listView.setAdapter(customListAdapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item value
                String itemValue = (String) listView.getItemAtPosition(position);

                for(Person person:persons) {
                    if ((person.firstName).equals(itemValue))
                        intent.putExtra("extra",person);
                }
                startActivity(intent);
                // Show Alert
             /*  Toast.makeText(getApplicationContext(),
                        "Position :"+position+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();*/

            }

        });

    }


}

