package thuy.formtinhtoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1, editTextSo2;
    Button buttonTaoDl;
    ImageButton Cong, Tru, Nhan, Chia;
    TextView textViewKetQua;

    void LayDL(){
        editTextSo1 = findViewById(R.id.edtSo1);
        editTextSo2 = findViewById(R.id.edtSo2);
        buttonTaoDl = findViewById(R.id.btnTaoDL);
        textViewKetQua = findViewById(R.id.tvKq);
        Cong = findViewById(R.id.btnCong);
        Tru = findViewById(R.id.btnTru);
        Nhan = findViewById(R.id.btnNhan);
        Chia = findViewById(R.id.btnChia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayDL();
        buttonTaoDl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TaoDl();
            }
        });
        Cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PhepCong();
            }
        });
        Tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PhepTru();
            }
        });
        Nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PhepNhan();
            }
        });
        Chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PhepChia();
            }
        });
    }
    void TaoDl(){
        Random ngaunhien = new Random();
        int SoNgauNhien1 = ngaunhien.nextInt(10)+1;
        int SoNgauNhien2 = ngaunhien.nextInt(10)+1;
        editTextSo1.setText(String.valueOf(SoNgauNhien1));
        editTextSo2.setText(String.valueOf(SoNgauNhien2));
    }
    void PhepCong(){
        String strA = editTextSo1.getText().toString();
        String strB = editTextSo2.getText().toString();

        //chuyển DL
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        //Tính tổng
        int tong = soA + soB;
        String strTong = String.valueOf(tong);

        //hiện ra màn hình
        textViewKetQua.setText(strTong);

    }
    void PhepTru(){
        String strA = editTextSo1.getText().toString();
        String strB = editTextSo2.getText().toString();

        //chuyển DL
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        //Tính hiệu
        int hieu = soA - soB;
        String strHieu = String.valueOf(hieu);

        //hiện ra màn hình
        textViewKetQua.setText(strHieu);
    }
    void PhepNhan(){
        String strA = editTextSo1.getText().toString();
        String strB = editTextSo2.getText().toString();

        //chuyển DL
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        //Tính tích
        int tich = soA * soB;
        String strTich = String.valueOf(tich);

        //hiện ra màn hình
        textViewKetQua.setText(strTich);
    }
    void PhepChia(){
        String strA = editTextSo1.getText().toString();
        String strB = editTextSo2.getText().toString();

        //chuyển DL
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        //Tính thương
        float tich = (float)soA / soB;
        String strTich = String.valueOf(tich);

        //hiện ra màn hình
        textViewKetQua.setText(strTich);
    }
}