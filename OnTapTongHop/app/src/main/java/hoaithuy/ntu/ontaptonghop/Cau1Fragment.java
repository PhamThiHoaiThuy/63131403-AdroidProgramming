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
    EditText ediTex_Met;
    EditText ediTex_KiloMet;
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
        ediTex_Met = view_Cau1.findViewById(R.id.edtSoM);
        ediTex_KiloMet = view_Cau1.findViewById(R.id.edtSoKm);
        btnDoi = view_Cau1.findViewById(R.id.btnDoiDonVi);
        //lắng nghe sự kiện
        btnDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String duLieuM = ediTex_Met.getText().toString();
                String duLieuKm = ediTex_KiloMet.getText().toString();
                if (!duLieuM.isEmpty()) {
                    // Convert meters to kilometers

                        double meters = Double.parseDouble(duLieuM);
                        double kilometers = meters / 1000;
                        ediTex_KiloMet.setText(String.format("%.3f", kilometers));
                        Toast.makeText(view_Cau1.getContext(), "đổi từ m->km", Toast.LENGTH_SHORT).show();
                } else if (!duLieuKm.isEmpty()) {
                    // Convert kilometers to meters
                        double kilometers = Double.parseDouble(duLieuKm);
                        double meters = kilometers * 1000;
                        ediTex_Met.setText(String.valueOf(meters));
                        Toast.makeText(view_Cau1.getContext(), "đổi từ km->m", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(view_Cau1.getContext(), "Dữ liệu không hợp lệ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view_Cau1;
    }
}