package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Gắn layout tương ứng với file này
        setContentView(R.layout.activity_main);
    }

    //đây là bộ lắng nghe và xử lí sự kiện tính tổng
    public  void XuLyCong(View view){
        //Tìm, tham chiếu điều khiển trên tập XML
        EditText editTextSoA =  findViewById(R.id.edtA);
        EditText editTextSoB =  findViewById(R.id.edtB);
        EditText editTextKQ =  findViewById(R.id.edtKQ);

        //lấy DL
        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        //chuyển DL
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        //Tính tổng
        int tong = soA + soB;
        String strTong = String.valueOf(tong);

        //hiện ra màn hình
        editTextKQ.setText(strTong);
    }
}