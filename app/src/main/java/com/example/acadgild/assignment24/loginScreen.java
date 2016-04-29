package com.example.acadgild.assignment24;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginScreen extends AppCompatActivity {

    EditText loginScreen_Email, loginScreen_Password ;
    Button loginScreen_Button ;
    TextView loginScreen_signUp;
    TextView Welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        loginScreen_Email = (EditText)findViewById(R.id.loginScreen_Email);
        loginScreen_Password= (EditText)findViewById(R.id.loginScreen_Password);
        loginScreen_Button=(Button)findViewById(R.id.loginScreen_Button);
        Welcome=(TextView)findViewById(R.id.Welcome);


        loginScreen_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String name = loginScreen_Email.getText().toString();
                final String pass = loginScreen_Password.getText().toString();

                if (name.length() < 1) {

                    if (pass.length() < 1)
                        loginScreen_Email.setError("Username and password cannot be blank");
                     else
                        loginScreen_Email.setError("Username cannot be blank");

                }
                else {
                    if (pass.length() < 1)

                        loginScreen_Password.setError("Password cannot be blank");
                    else
                        Welcome.setText("Login was successful");
                }


            }

        } );



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_screen, menu);
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
