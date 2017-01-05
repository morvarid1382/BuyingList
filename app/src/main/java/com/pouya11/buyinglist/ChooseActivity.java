package com.pouya11.buyinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ChooseActivity extends AppCompatActivity {
    EditText txtName;
    EditText txtFactory;
    ListView lstPhone;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        txtName = (EditText) findViewById(R.id.txt_name);
        txtFactory = (EditText) findViewById(R.id.txt_factory);


        ArrayList<PhoneRecord> dummy_list = new ArrayList<>();

        dummy_list.add(new PhoneRecord(0, "Mohammad", "Ghorbani"));
        dummy_list.add(new PhoneRecord(0, "Maria", "jakson"));
        dummy_list.add(new PhoneRecord(0, "john", "miller"));

        lstPhone.setAdapter(new PhoneAdabtor(this, R.layout.list_buying, dummy_list));

    }
    public void btnSaveClicked(View view) {
        String name = txtName.getText().toString();
        String factory = txtFactory.getText().toString();

        PhoneRecord phoneRecord = new PhoneRecord();
        phoneRecord.setName(name);
        phoneRecord.setFactory(factory);


        phoneRecord.save(this);

        if (phoneRecord.getId() > 0)
            Toast.makeText(this, "saved successfully", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "ooops!!!something wrong", Toast.LENGTH_LONG).show();
    }


    public void btnCancelClicked(View view) {
        finish();
    }
}


