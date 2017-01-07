package com.hanbit.kakao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hanbit.kakao.presentation.member.LoginActivity;
import com.hanbit.kakao.presentation.member.RegisterMemberActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    Button btLogin, btRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogin = (Button) findViewById(R.id.btLogin);
        btRegister = (Button) findViewById(R.id.btRegister);

        btLogin.setOnClickListener(this);
        btRegister.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btRegister:
                this.startActivity(new Intent(MainActivity.this, RegisterMemberActivity.class));
                break;

            case R.id.btLogin:
                Toast.makeText(MainActivity.this, "Click Login", Toast.LENGTH_LONG).show();
                this.startActivity(new Intent(MainActivity.this, LoginActivity.class));
                break;
        }

    }
}
