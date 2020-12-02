package com.example.contactmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.contactmanager.data.DatabaseHandler;
import com.example.contactmanager.model.Contact;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler db = new DatabaseHandler(MainActivity.this);

        Log.d("Count", "onCreate: " + db.getCount());

        //create contact object first
        Contact jeremy = new Contact();
        jeremy.setName("Jeremy");
        jeremy.setPhoneNumber("985747374");

        Contact json = new Contact();
        json.setName("Jason");
        json.setPhoneNumber("0877744");

        //Get 1 contact
//        Contact c = db.getContact(2);
//        c.setName("NewJson");
//        c.setPhoneNumber("2342");

//        int updateRow = db.updateContact(c);
//        Log.d("RowId", "onCreate: " + updateRow);

        //db.addContact(json);

        //delete a contact
        //db.deleteContact(c);

        List<Contact> contactList = db.getAllContacts();

        for(Contact contact : contactList) {
            Log.d("MainActivity", "onCreate: " + contact.getId());
        }
    }
}