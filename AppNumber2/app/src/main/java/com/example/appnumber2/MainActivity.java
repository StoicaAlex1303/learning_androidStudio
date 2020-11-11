package com.example.appnumber2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txt1 = (TextView)findViewById(R.id.txt1);
        TextView txt2 = (TextView)findViewById(R.id.txt2);
        TextView txt3 = (TextView)findViewById(R.id.txt3);

//        txt1.setText("My own text"); //Afiseaza in txt1 "My own text"
//
//        String str1 = "Some Value";
//        StringTokenizer strObject1 = new StringTokenizer(str1); //Constructor
//        txt2.setText(strObject1.nextToken());
//        txt3.setText(strObject1.nextToken());

//        Afiseaza in txt2 = Some si in txt3 = Value
/////////////////////////////////////////////////////////////////////////////////

//        String str2 = "This is another text@this is your text@this is my text";
//        StringTokenizer strObject2 = new StringTokenizer(str2, "@");//Constructor cu delimitare la "@"
//
//        txt1.setText(strObject2.nextToken());//Afiseaza "This is another text" in txt1
//        txt2.setText(strObject2.nextToken());//Afiseaza "this is your text" in txt2
//        txt3.setText(strObject2.nextToken());//Afiseaza "this is my text" in txt3

/////////////////////////////////////////////////////////////////////////////////



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
