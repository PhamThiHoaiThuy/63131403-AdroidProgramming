package ntu.thuy63131403;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextC, editTextK;
    Button buttonDoC, buttonDoK, buttonXoa;
    TextView textViewKq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void LayDL(){
        editTextC = findViewById(R.id.edtC);
        editTextK = findViewById(R.id.edtK);
        buttonDoC = findViewById(R.id.btnC);
        buttonDoK = findViewById(R.id.btnK);
        buttonXoa = findViewById(R.id.btnXoa);
        textViewKq = findViewById(R.id.txtKq);
        
    }
}