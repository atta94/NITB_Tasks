package com.example.nitb_tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Screen1 extends AppCompatActivity {

    Button login;
    ImageView fbicon, twittericon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_screen1 );

        login = findViewById ( R.id.login );
        fbicon = findViewById ( R.id.fbicon );
        twittericon = findViewById ( R.id.twittericon );


        login.setOnClickListener (
                new View.OnClickListener () {
                    @Override
                    public void onClick(View v) {

                        Intent i = new Intent ( getApplicationContext (), Login.class );
                        startActivity ( i );

                    }
                } );


        fbicon.setOnClickListener (
                new View.OnClickListener () {
                    @Override
                    public void onClick(View v) {
                        Uri uri = Uri.parse("http://www.facebook.com"); // missing 'http://' will cause crashed
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                } );


        twittericon.setOnClickListener (
                new View.OnClickListener () {
                    @Override
                    public void onClick(View v) {

                        Uri uri = Uri.parse("http://www.twitter.com"); // missing 'http://' will cause crashed
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);

                    }
                } );

    }
}
//
//    public void login(View v) {
//        // TODO Auto-generated method stub
//
//    }


