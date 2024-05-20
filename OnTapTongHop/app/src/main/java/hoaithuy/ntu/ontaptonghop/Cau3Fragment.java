package hoaithuy.ntu.ontaptonghop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Cau3Fragment extends Fragment {
    //1. Khai báo các biến toàn cục
    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    //2. Khai báo các biến đại diện cho các view cần tương tác
    RecyclerView recyclerViewLandScape;


    public Cau3Fragment() {
        // Required empty public constructor
    }


    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //3. Chuẩn bị dữ liệu cho list
        list = new ArrayList<LandScape>();
        list.add(new LandScape("flag_tower_of_hanoi","Cột cờ Hà Nội"));
        list.add(new LandScape("effel","Tháp Eiffel"));
        list.add(new LandScape( "buckingham","Cung điện Buckingham"));
        list.add(new LandScape( "statue_of_liberty","Tượng nữ thần tự do"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view_Cau3 = inflater.inflate(R.layout.fragment_cau3, container, false);
        recyclerViewLandScape = view_Cau3.findViewById(R.id.ryCau3);
        // Inflate the layout for this fragment
        //4. Tìm điều khiển Recycler
        recyclerViewLandScape = view_Cau3.findViewById(R.id.ryCau3);

        //5. Tạo layout manager để đặt bố cục cho Recycler
        //hướng dọc:
//        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(view_Cau3.getContext());
//        recyclerViewLandScape.setLayoutManager(layoutLinear);

        // Tạo LinearLayoutManager với hướng ngang
        RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(view_Cau3.getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewLandScape.setLayoutManager(layoutLinearHorizonal);

        // Tạo GridLayoutManager với số cột mong muốn
//        int numberOfColumns = 2; // Số cột bạn muốn hiển thị
//        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(view_Cau3.getContext(), numberOfColumns);
//        recyclerViewLandScape.setLayoutManager(layoutGrid);

        //6. Tạo adapter gắn vào nguồn dữ liệu
        adapter = new LandScapeAdapter(view_Cau3.getContext(), list);
        //7, Gắn adapter vào Recycler
        recyclerViewLandScape.setAdapter(adapter);
        return view_Cau3;
    }
}