package thuy.ntu.intent_login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void QuaylaiTC(View v) {
        Intent ManHinhChinh = new Intent(this, MainActivity.class);
        startActivity(ManHinhChinh);
    }
}
