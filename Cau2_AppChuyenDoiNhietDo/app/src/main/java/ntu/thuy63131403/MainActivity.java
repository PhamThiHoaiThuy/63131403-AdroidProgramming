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
        String strK = editTextK.getText().toString();
        //chuyển DL
        double doK = Double.parseDouble(strK);

        //Tính tổng
        double doC = doK - 273.15;
        String strdoC = String.valueOf(doC);

        //hiện ra màn hình
        textViewKq.setText(strdoC);

    }
    void ChuyenSangDoK(){
        String strC = editTextC.getText().toString();
        //chuyển DL
        double doC = Double.parseDouble(strC);

        //Tính tổng
        double doK = doC + 273.15;
        String strdoK = String.valueOf(doK);

        //hiện ra màn hình
        textViewKq.setText(strdoK);
    }
    void Xoa(){

    }

}