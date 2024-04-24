package thuy.ntu.intent_login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText Name, Pass, EMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Name = findViewById(R.id.editUserName);
        Pass = findViewById(R.id.edtPass);
        EMail = findViewById(R.id.edtMail);
    }

    public void DangNhap(View v) {
        String username = Name.getText().toString();
        String password = Pass.getText().toString();
        String email = EMail.getText().toString();

        if(username.equals("hoaithuy")&&password.equals("123")&&email.equals("pththuy@gmail.com")){
            Toast.makeText(this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
            Intent ManHinhHome = new Intent(this, HomeActivity.class);
            startActivity(ManHinhHome);
        }
        else {
            Toast.makeText(this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
        }


    }
}

