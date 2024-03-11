package com.example.ex6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hiển thị ữ liệu lên listview
        //b1: cần có dữ liệu
        //?? từ đâu có
        ArrayList<String> dsTenTinhThanhVN;//khai báo

        dsTenTinhThanhVN = new ArrayList<String>();//tạo thể hiện cụ thể, xin mới
        //them DL
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("TP Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Nha Trang");

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
        


    }
}