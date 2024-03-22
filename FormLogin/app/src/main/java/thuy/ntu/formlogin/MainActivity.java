package thuy.ntu.formlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextUser, editTextPass;
    Button buttonLogin;
    TextView textViewAttempt;
    int dem;
    void layDL(){
        editTextUser = findViewById(R.id.edtUser);
        editTextPass = findViewById(R.id.edtPass);
        buttonLogin = findViewById(R.id.btnLogin);
        textViewAttempt = findViewById(R.id.textAttemp);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layDL();
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLy();
            }
        });
    }
    void XuLy(){
        String Username = editTextUser.getText().toString();
        String password = editTextPass.getText().toString();
        dem++;
        textViewAttempt.setText(String.valueOf(dem));
        if(Username.equals("MaiCuongTho")&&password.equals("123")){
            Toast.makeText(this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
        }

    }
}