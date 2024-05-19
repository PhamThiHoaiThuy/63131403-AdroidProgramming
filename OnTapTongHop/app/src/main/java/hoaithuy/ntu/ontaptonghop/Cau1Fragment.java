package hoaithuy.ntu.ontaptonghop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Cau1Fragment extends Fragment {
    EditText soM;
    EditText soKM;
    Button btnDoi;

    public Cau1Fragment() {
        // Required empty public constructor
    }

    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view_Cau1 = inflater.inflate(R.layout.fragment_cau1, container, false);
        //tìm điêều khiển trong view này
        soM = view_Cau1.findViewById(R.id.edtSoM);
        soKM = view_Cau1.findViewById(R.id.edtSoKm);
        btnDoi = view_Cau1.findViewById(R.id.btnDoiDonVi);
        //lắng nghe sự kiện
        btnDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String duLieuM = soM.getText().toString();
                String duLieuKm = soKM.getText().toString();
                if (!duLieuM.isEmpty()) { // Chuyển đổi từ mét sang kilômét
                    try {
                        double m = Double.parseDouble(duLieuM);
                        double km = m / 1000; // 1 mét = 0.001 kilômét
                        soKM.setText(String.valueOf(km));
                        Toast.makeText(view_Cau1.getContext(), "Đã chuyển đổi từ m sang km", Toast.LENGTH_SHORT).show();
                    } catch (NumberFormatException e) {
                        Toast.makeText(view_Cau1.getContext(), "Vui lòng nhập số hợp lệ", Toast.LENGTH_SHORT).show();
                    }
                } else if (!duLieuKm.isEmpty()) { // Chuyển đổi từ kilômét sang mét
                    try {
                        double km = Double.parseDouble(duLieuKm);
                        double m = km * 1000; // 1 kilômét = 1000 mét
                        soM.setText(String.valueOf(m));
                        Toast.makeText(view_Cau1.getContext(), "Đã chuyển đổi từ km sang m", Toast.LENGTH_SHORT).show();
                    } catch (NumberFormatException e) {
                        Toast.makeText(view_Cau1.getContext(), "Vui lòng nhập số hợp lệ", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(view_Cau1.getContext(), "Vui lòng nhập giá trị cần chuyển đổi", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view_Cau1;
    }
}