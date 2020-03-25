package com.example.cruddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    private Button m_btnListUser;
    private TextView m_tvMrOrMs, m_tvUserNameShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        final Intent intentGotoListUserAct = new Intent(this,ListUserActivity.class);

        m_btnListUser = (Button) findViewById(R.id.btnListUser);
        m_tvMrOrMs = (TextView) findViewById(R.id.tvMrOrMs);
        m_tvUserNameShow = (TextView) findViewById(R.id.tvUserNameShow);

        m_btnListUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentGotoListUserAct);
                UserActivity.this.finish();
            }
        });

    }
}
