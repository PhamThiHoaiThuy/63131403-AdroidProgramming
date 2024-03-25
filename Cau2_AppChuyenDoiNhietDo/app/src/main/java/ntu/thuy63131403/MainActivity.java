package ntu.thuy63131403;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextC, editTextK;
    Button buttonDoC, buttonDoK, buttonXoa;
    TextView textViewKq;
    void LayDL(){
        editTextC = findViewById(R.id.edtC);
        editTextK = findViewById(R.id.edtK);
        buttonDoC = findViewById(R.id.btnC);
        buttonDoK = findViewById(R.id.btnK);
        buttonXoa = findViewById(R.id.btnXoa);
        textViewKq = findViewById(R.id.txtKq);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayDL();
        buttonDoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChuyenSangDoC();
            }
        });
        buttonDoK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChuyenSangDoK();
            }
        });
        buttonXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xoa();
            }
        });
    }
    void ChuyenSangDoC(){
        try {
            String strK = editTextK.getText().toString();
            double doK = Double.parseDouble(strK);
            double doC = doK - 273.15;
            textViewKq.setText(String.format("%.2f °C", doC));
        } catch (NumberFormatException e) {
            textViewKq.setText("Mời bạn nhập vào ô độ K ");
        }
    }

    void ChuyenSangDoK(){
        try {
            String strC = editTextC.getText().toString();
            double doC = Double.parseDouble(strC);
            double doK = doC + 273.15;
            textViewKq.setText(String.format("%.2f K", doK));
        } catch (NumberFormatException e) {
            textViewKq.setText("Mời bạn nhập vào ô độ C ");
        }
    }
    void Xoa(){
        editTextK.setText("");
        editTextC.setText("");
        textViewKq.setText("");
    }

}