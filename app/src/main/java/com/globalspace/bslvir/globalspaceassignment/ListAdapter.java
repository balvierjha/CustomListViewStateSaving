package com.globalspace.bslvir.globalspaceassignment;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 7/11/2015.
 */
public class ListAdapter extends BaseAdapter {
    Context context;
    ArrayList<ProductItems> data;
    private static LayoutInflater inflater = null;
    SharedPreferences prefs;
    Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
    ArrayList<String> spinnerArrayList;
    ArrayAdapter<CharSequence> spinnerAdapter;


    public ListAdapter(MainActivity mainActivity, ArrayList<ProductItems> data) {
        // TODO Auto-generated constructor stub

        context = mainActivity;
        this.data = data;
        inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // remarkMap = new HashMap<Integer, Integer>();
        spinnerAdapter = ArrayAdapter.createFromResource(context, R.array.remarkslist, android.R.layout.simple_spinner_item);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    class ViewHolder {
        CheckBox chkSave;
        TextView txtItemName;
        TextView txtItemDesc;
        Spinner spinnerRemarks;
    }

    ViewHolder viewHolder = null;


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.rowitemlist, null);
            viewHolder = new ViewHolder();
            viewHolder.chkSave = (CheckBox) convertView.findViewById(R.id.chkSave);
            viewHolder.txtItemName = (TextView) convertView.findViewById(R.id.txtItemName);
            viewHolder.txtItemDesc = (TextView) convertView.findViewById(R.id.txtItemDesc);
            viewHolder.spinnerRemarks = (Spinner) convertView.findViewById(R.id.spinnerRemarks);
            viewHolder.spinnerRemarks.setAdapter(spinnerAdapter);
            convertView.setTag(viewHolder);
            convertView.setTag(R.id.txtItemName, viewHolder.txtItemName);
            convertView.setTag(R.id.txtItemDesc, viewHolder.txtItemDesc);
            convertView.setTag(R.id.chkSave, viewHolder.chkSave);
            viewHolder.chkSave.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    int getPosition = (Integer) buttonView.getTag();
                    data.get(getPosition).setChecked(buttonView.isChecked());
                }
            });
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ((Spinner) convertView.findViewById(R.id.spinnerRemarks)).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position1, long id) {
                myMap.put(position, position1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        viewHolder.chkSave.setTag(position);
        ProductItems items = data.get(position);
        viewHolder.chkSave.setChecked(items.isChecked());
        viewHolder.txtItemName.setText(items.getItemName());
        viewHolder.txtItemDesc.setText(items.getItemDesc());
        if (myMap.containsKey(position)) {
            viewHolder.spinnerRemarks.setSelection(myMap.get(position));
        }
        if (myMap.get(position) != null) {
            ((Spinner) convertView.findViewById(R.id.spinnerRemarks)).setSelection(myMap.get(position));
        }

        //return the view to be displayed
        return convertView;
    }
}