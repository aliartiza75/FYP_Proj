package com.example.john.nerve_segmentation;

import android.content.Intent;
import android.preference.PreferenceActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_icon);



    } // on create end

    public void SIGN_IN_onClick (View view) {
        EditText username = (EditText) findViewById(R.id.editText);
        EditText password = (EditText) findViewById(R.id.editText2);


        if ( !(username.getText().toString().trim().length() > 0) ) {
            Toast toast = Toast.makeText(getApplicationContext(),"Enter username".toString(),Toast.LENGTH_LONG);
            toast.show();



        } // if end
        else if( !(password.getText().toString().trim().length() > 0) )
        {
            Toast toast = Toast.makeText(getApplicationContext(),"Enter password".toString(),Toast.LENGTH_LONG);
            toast.show();
        } // else if end

        Intent i = new Intent(this,Homepage.class);
        startActivity(i);
    } // function end



    public void showToast(final String toast)
    {
        runOnUiThread(new Runnable() {
            public void run()
            {
                Toast.makeText(getApplicationContext(), toast, Toast.LENGTH_SHORT).show();
            }
        });
    } // function end

    public void Move_Forward (View view) {

    } // function end


} // class end
