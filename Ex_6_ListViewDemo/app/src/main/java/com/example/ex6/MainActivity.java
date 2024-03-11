package com.example.ex6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN;//khai báo

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hiển thị ữ liệu lên listview
        //b1: cần có dữ liệu
        //?? từ đâu có

        dsTenTinhThanhVN = new ArrayList<String>();//tạo thể hiện cụ thể, xin mới
        //them DL
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("TP Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Khánh Hòa");
        dsTenTinhThanhVN.add("Bình Định");
        //b2: tạo adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this,android.R.layout.
                simple_list_item_1,dsTenTinhThanhVN);

        //b3: gắn vào điều khiển hiển thị listview
        //3.1 tìm
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTt);
        //3.2 gắn
        lvTenTinhThanh.setAdapter(adapterTinhThanh);

        //3.3 lắng nghe và xử lý
        //gắn bộ lắng nghe vào
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);


    }

    //tạo bộ lắng nghe , đặt vào một biến
    AdapterView.OnItemClickListener BoLangNghevaXL= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //code xử lí ở đây
            //lấy giá trị của phần tử thứ i
            String strTenTinhChon = dsTenTinhThanhVN.get(position);
            Toast.makeText(MainActivity.this,strTenTinhChon, Toast.LENGTH_LONG).show();
        }
    };
}