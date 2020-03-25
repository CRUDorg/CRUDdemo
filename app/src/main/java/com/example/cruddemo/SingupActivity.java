package com.example.cruddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SingupActivity extends AppCompatActivity {

    private EditText m_txtFirstname, m_txtLastname, m_txtUsernameSingup, m_txtPasswordSingup;
    private Button m_btnSinguup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        final Intent intentGotoLogin = new Intent(this, LoginActivity.class);

        m_txtFirstname = (EditText) findViewById(R.id.txtFirstName);
        m_txtLastname = (EditText) findViewById(R.id.txtLastName);
        m_txtUsernameSingup = (EditText) findViewById(R.id.txtUsernameSingup);
        m_txtPasswordSingup = (EditText) findViewById(R.id.txtPasswordSignup);
        m_btnSinguup = (Button) findViewById(R.id.btnSingup);

        m_btnSinguup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentGotoLogin);
                SingupActivity.this.finish();
            }
        });


    }
}
