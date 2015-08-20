package com.example.tezrosolutions.testapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
//import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    private static String TAG= "Message: " ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Log.i(TAG,"onCreate");

        //Layout
        RelativeLayout orelativeLayout = new RelativeLayout(this);
        orelativeLayout.setBackgroundColor(Color.parseColor("#007293"));

        //Button
        Button oblueButton = new Button(this);
        oblueButton.setId(2);
        oblueButton.setText("Log In");
        oblueButton.setBackgroundColor(Color.WHITE);

        RelativeLayout.LayoutParams obuttonDetails= new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //User Input
        EditText ousername = new EditText(this);

        ousername.setId(1);
        obuttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        obuttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        RelativeLayout.LayoutParams ousernameDetails= new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        // wiget positions
        ousernameDetails.addRule(orelativeLayout.ABOVE,oblueButton.getId());
        ousernameDetails.addRule(orelativeLayout.CENTER_HORIZONTAL);
        ousernameDetails.setMargins(0,0,0,50);
 //todo: fix the user text width  left on tutorial 16
        //adding to the layout
        orelativeLayout.addView(ousername, ousernameDetails);
        orelativeLayout.addView(oblueButton,obuttonDetails);
        setContentView(orelativeLayout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Log.i(TAG, "onStart");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
