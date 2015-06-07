package com.example.panchapikesarao.myapplication;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.lang.String;
import java.nio.charset.CharacterCodingException;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    Button b;
public void selfDestruct(View v)
{
    if (v==findViewById(R.id.btn1))
    {
    Context context = getApplicationContext();
    CharSequence txt = "U clicked on SPOTIFY STREAMER";
    int duration = Toast.LENGTH_SHORT;
    Toast.makeText(context, txt, duration).show();
    }
    else if (v==findViewById(R.id.btn2))
    {
        Context context = getApplicationContext();
        CharSequence txt = "U clicked on SCORES APP";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, txt, duration).show();
    }
    else if (v==findViewById(R.id.btn3))
    {
        Context context = getApplicationContext();
        CharSequence txt = "U clicked on LIBRARY APP";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, txt, duration).show();
    }
    else if (v==findViewById(R.id.btn4))
    {
        Context context = getApplicationContext();
        CharSequence txt = "U clicked on BUILD IT BIGGER";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, txt, duration).show();
    }
    else if (v==findViewById(R.id.btn5))
    {
        Context context = getApplicationContext();
        CharSequence txt = "U Clicked on PDF READER";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, txt, duration).show();
    }
else
{
    Context context = getApplicationContext();
    CharSequence txt = "U clicked on CAPSTONE: MY OWN APP";
    int duration = Toast.LENGTH_SHORT;
    Toast.makeText(context, txt, duration).show();
}

}


}

