package com.example.john.nerve_segmentation;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by john on 11/26/2016.
 */
public class Splash extends Activity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.requestWindowFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.splash);
        if(getResources().getDisplayMetrics().widthPixels>getResources().getDisplayMetrics(). heightPixels)
        {
            //Toast.makeText(this,"Screen switched to Landscape mode",Toast.LENGTH_SHORT).show();
        }
        else
        {
            //Toast.makeText(this,"Screen switched to Portrait mode",Toast.LENGTH_SHORT).show();
        }








        final ImageView iv = (ImageView) findViewById(R.id.imageView);
        final ImageView logo = (ImageView) findViewById(R.id.imageView2);

        final Animation an = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);
        final Animation an2 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.abc_fade_out);

        logo.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                logo.startAnimation(an2);
                iv.startAnimation(an2);

                finish(); // finish current intent
                Intent i = new Intent(Splash.this, MainActivity.class); // making new intent
                startActivity(i); // starting that intent
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    } // onCreate end


} // Class end
