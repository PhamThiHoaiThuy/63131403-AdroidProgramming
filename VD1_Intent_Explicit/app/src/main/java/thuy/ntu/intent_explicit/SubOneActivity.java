package thuy.ntu.intent_explicit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SubOneActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subone);

        Button btnQL = findViewById(R.id.btnquaylai);

        btnQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyenTC = new Intent(SubOneActivity.this, MainActivity.class);

                startActivity(chuyenTC);
            }
        });
    }
}
