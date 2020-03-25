package com.example.cruddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText m_txtUsername, m_txtPassword;
    private Button m_btnLogin;
    private TextView m_tvCreateAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Intent intentGotoUserAct = new Intent(this,UserActivity.class );
        final Intent intentGotoSingupAct = new Intent(this,SingupActivity.class);

        m_txtUsername = (EditText) findViewById(R.id.txtUsernameSingup);
        m_txtPassword = (EditText) findViewById(R.id.txtPasswordLogin);
        m_btnLogin = (Button) findViewById(R.id.btnLogin);
        m_tvCreateAcc = (TextView) findViewById(R.id.tvCreateAcc);


        m_btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentGotoUserAct);
                LoginActivity.this.finish();
            }
        });


        m_tvCreateAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentGotoSingupAct);
                LoginActivity.this.finish();
            }
        });


    }
}
