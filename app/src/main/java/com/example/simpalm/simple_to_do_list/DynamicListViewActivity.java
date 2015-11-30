package com.example.simpalm.simple_to_do_list;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class DynamicListViewActivity extends Activity {

    private EditText AddItemEt;
    private Button AddItemBtn;
    private ListView ItemsListView;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_list_view);

        AddItemEt = (EditText) findViewById(R.id.itemEditText);
        AddItemBtn = (Button) findViewById(R.id.btnadditem);
        ItemsListView = (ListView) findViewById(R.id.itemlistView);

        // initialize the list and add item
        list = new ArrayList<String>();

        // initialize the arrayAdapter

        adapter = new ArrayAdapter<String>(DynamicListViewActivity.this, android.R.layout.simple_list_item_1, list);


        // setting the adapter to the listview

        ItemsListView.setAdapter(adapter);

        AddItemBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String todoItem = AddItemEt.getText().toString();
                if (todoItem.length() > 0) {
                    // add editText value to the list

                    list.add(AddItemEt.getText().toString());
                    // refresh the listview

                    adapter.notifyDataSetChanged();

                    // clear the edittext for the new item
                    AddItemEt.setText("");
                }
            }
        });

        // delete item on long press on the item

        ItemsListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                // remove the item from the list

                list.remove(position);

                // apply changes on the adapter to refresh the listview

                adapter.notifyDataSetChanged();
                return true;
            }
        });

    }


}
