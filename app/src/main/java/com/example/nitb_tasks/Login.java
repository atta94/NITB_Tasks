package com.example.nitb_tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nitb_tasks.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login extends AppCompatActivity {


    private EditText cnic, password;

//    String pattern = "^[0-9+]{5}-[0-9+]{7}-[0-9]{1}$";
    String patterncnic = "^[0-9]{13}$";
    String patternpassword = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{18,}$";
TextInputLayout inputlayout;
    Matcher mc, mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_login );

        cnic = findViewById ( R.id.cnic );
        password = findViewById ( R.id.password );

        inputlayout = findViewById ( R.id.cnicinput );

    }

    public void userlogin(View v) {

        String cnicinput = cnic.getText ().toString ().trim ();
        String passwordinput = password.getText ().toString ().trim ();

        Pattern rc = Pattern.compile ( patterncnic );

        Pattern rp = Pattern.compile ( patternpassword );


        if (!cnicinput.isEmpty ()) {
            mc = rc.matcher ( cnicinput );

            //       cnic.setError ( "Please Enter Your CNIC " );
        } else {
                   cnic.setError ( "Please Enter Your CNIC Number " );
        }
        if (mc.find ()) {
            Toast.makeText ( Login.this, "Valid CNIC", Toast.LENGTH_LONG ).show ();
        } else {
            cnic.setError ( "Please Enter Your CNIC" );
        }


//
//        if (!passwordinput.isEmpty () &&  passwordinput.length () <= 6 ) {
//            mp = rp.matcher ( passwordinput )  ;
//
//            //       cnic.setError ( "Please Enter Your CNIC " );
//        }
//        else {
//            Toast.makeText ( Login.this, "Please Enter 6digit Number ", Toast.LENGTH_LONG ).show ();
//
//        }
//        if (mp.find ()) {
//            Toast.makeText ( Login.this, "Valid CNIC", Toast.LENGTH_LONG ).show ();
//        } else {
//            password.setError ( "Please Enter Your Password" );
//        }

//
        if (!passwordinput.isEmpty () && passwordinput.length ()>=6) {
            Toast.makeText ( Login.this, "Valid pass", Toast.LENGTH_LONG ).show ();

        }
        else {
            password.setError ( "Please Enter Your Password" );
        }

        //
    }
//        if(validatecnic(cnicinput))
//    {
//
//    }
//    public static boolean validatecnic(String cnic){
//         return  cnic.length ()==13 && cnic.matches ( "[0-9+]" );
//
//}
}



