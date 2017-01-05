package com.pouya11.buyinglist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HP on 05/01/2017.
 */
public class PhoneAdabtor extends ArrayAdapter<PhoneRecord>{


        public PhoneAdabtor(Context context, int resource, List<PhoneRecord> objects) {
            super(context, resource, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater
                        .from(getContext())
                        .inflate(R.layout.list_buying, parent, false);
                TextView txtName =(TextView) convertView.findViewById(R.id.lbl_name);
                TextView txtFamily  =(TextView) convertView.findViewById(R.id.lbl_factory);



                txtName.setText(getItem(position).getName());
                txtFamily.setText(getItem(position).getfactory());

            }
            return convertView;
        }
}
