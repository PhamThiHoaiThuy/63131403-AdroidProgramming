package com.example.ex6_cong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsSach; // khai bao
    Button btnThem, btnSua, btnXoa;

    EditText editTextSach;
    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // hien thi du lieu len listView
        // b1: can du lieu
        // du lieu tu CDL ( SQL , noSQL, XML, ...)
        // can bien phu hop de chua dl


        dsSach = new ArrayList<String>(); // khai bao cu the

        btnThem = (Button) findViewById(R.id.btnThem);
        btnSua = (Button) findViewById(R.id.btnSua);
        btnXoa = (Button) findViewById(R.id.btnXoa);

        editTextSach = (EditText) findViewById(R.id.edtThem);
        // them du lieu ( tu 1 nguon or cho san ( hard-code)
        dsSach.add("Dễ mèn phiêu lưu kí");
        dsSach.add("Tôi thấy hoa vàng trên cỏ xanh");
        dsSach.add("Truyện kiều");
        dsSach.add("Mắt biếc");
        dsSach.add("Chí Phèo");
        dsSach.add("Harry Potter");
        // b2: tao adapter
        ArrayAdapter<String> adapterSach;
        adapterSach = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsSach);
        // b3: gan vao DK hien thi ListView
        // b3.1: tim
        ListView lvDSSach = findViewById(R.id.lvDSSach);
        // b3.2 gan
        lvDSSach.setAdapter(adapterSach);
        // b3.3 lang nghe va xu ly SK nguoi dung tuong tac
        lvDSSach.setOnItemClickListener(BLNVXL);

        // Them
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sach = editTextSach.getText().toString();
                dsSach.add(sach);
                adapterSach.notifyDataSetChanged();
                Toast.makeText(MainActivity.this,"Thêm thành công",Toast.LENGTH_SHORT).show();
            }
        });

        // Sua
        lvDSSach.setOnItemClickListener((new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                editTextSach.setText(dsSach.get(i));
                vitri = i;
            }
        }));

        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dsSach.set(vitri, editTextSach.getText().toString());
                adapterSach.notifyDataSetChanged();
                Toast.makeText(MainActivity.this,"Sửa thành công",Toast.LENGTH_SHORT).show();
            }
        });

        // Xoa
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(vitri != -1) {
                    dsSach.remove(vitri);
                    adapterSach.notifyDataSetChanged();
                    Toast.makeText(MainActivity.this, "Xóa thành công", Toast.LENGTH_SHORT).show();
                    editTextSach.setText("");
                    vitri = -1;
                } else {
                    Toast.makeText(MainActivity.this, "Vui lòng chọn lớp cần xóa", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    // tao 1 bo lang nghe va XLSK onItemClick
    AdapterView.OnItemClickListener BLNVXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
            // i la vi tri cua pt dc click

            // hien thi nhanh 1 thong bao ( hien vi tri cua pt )
            // Toast.makeText(MainActivity.this,"Ban vua click vao i"+String.valueOf(i), Toast.LENGTH_SHORT).show();
            // hien gia tri cua pt i
            String strTenMH = dsSach.get(i);
            Toast.makeText(MainActivity.this,strTenMH, Toast.LENGTH_SHORT).show();
        }
    };
}