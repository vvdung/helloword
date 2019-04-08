package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;
import java.lang.String;

public class MainActivity extends AppCompatActivity {

    EditText edtUser,edtPass;
    Button   btnLogin, btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUser = (EditText)findViewById(R.id.edtUsername);
        edtPass = (EditText)findViewById(R.id.edtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegister = (Button)findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new CButtonLogin());
        btnRegister.setOnClickListener(new CButtonRegister());
    }

    public class CButtonLogin implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            String szUser = edtUser.getText().toString();
            String szPass = edtPass.getText().toString();

            if (szUser.length() <= 3 || szPass.length() < 6){
                Toast.makeText(getApplicationContext(),"Tài khoản hoặc mật khẩu không hợp lệ!",Toast.LENGTH_SHORT).show();
                return;
            }
            String szMsg = "[" + szUser + "/"  + szPass + "]";
            Toast.makeText(getApplicationContext(),szMsg,Toast.LENGTH_SHORT).show();
        }
    }

    public class CButtonRegister implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"CButtonRegister::onClick...",Toast.LENGTH_SHORT).show();
        }
    }
}
