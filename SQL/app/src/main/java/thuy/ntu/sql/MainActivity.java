package thuy.ntu.sql;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //b0: tạo file CSDL
        SQLiteDatabase db = openOrCreateDatabase("MyBook.db",//tên csdl
                                    MODE_PRIVATE,   //giới hạn truy cập
                                    null);          //con trỏ
        //b1. Tạo bảng

        String sqlXoaBangNeuCo =  "DROP TABLE IF EXISTS BOOKS;";
        String sqlTaoBang = "CREATE TABLE BOOKS(BookID integer PRIMARY KEY," +
                                                "BookName text,"+
                                                "Page integer,"+
                                                "Price Float, "+
                                                "Description text);";
        //thực hiện lệnh sql
        db.execSQL(sqlXoaBangNeuCo);
        db.execSQL(sqlTaoBang);
        // Thêm một số dòng dữ liệu vào bảng
        String sqlThem1 = "INSERT INTO BOOKS VALUES(1, 'Java', 100, 9.99, 'sách về java');";
        String sqlThem2 = "INSERT INTO BOOKS VALUES(2, 'Android', 320, 19.00, 'Android cơ bản');";
        String sqlThem3 = "INSERT INTO BOOKS VALUES(3, 'Học làm giàu', 120, 0.99, 'sách đọc cho vui');";
        String sqlThem4 = "INSERT INTO BOOKS VALUES(4, 'Tử điển Anh-Việt', 1000, 29.50, 'Từ điển 100.000 từ');";
        String sqlThem5 = "INSERT INTO BOOKS VALUES(5, 'CNXH', 1, 1, 'chuyện cổ tích');";
        db.execSQL(sqlThem1);
        db.execSQL(sqlThem2);
        db.execSQL(sqlThem3);
        db.execSQL(sqlThem4);
        db.execSQL(sqlThem5);
        //đóng lại để check
        db.close();
    }
}