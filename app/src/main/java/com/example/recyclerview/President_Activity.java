package com.example.recyclerview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class President_Activity extends AppCompatActivity {

    private TextView tvname, tvdescription;
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_president_);

        tvname = (TextView)findViewById (R.id.txtname);
        tvdescription = (TextView) findViewById (R.id.txtdesc);
        img =(ImageView) findViewById (R.id.presidentthumbnail);

        //Receiving the data
        Intent intent = getIntent ();
        String Name = intent.getExtras ().getString("Name");
        String Description = intent.getExtras ().getString ("Description");
        int image = intent.getExtras ().getInt("Thumbnail");

        //setting the values

        tvname.setText (Name);
        tvdescription.setText (Description);
        img.setImageResource(image);
        ActionBar name = getSupportActionBar ();
        name.setTitle (tvname.getText ().toString ());
    }
}
