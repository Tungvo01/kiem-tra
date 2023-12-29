package com.example.kiemtraand.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(@Nullable Context context) {
        super(context, "QLSanPham", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE SanPham(MaSP INTEGER PRIMARY KEY AUTOINCREMENT, " + "TenSP TEXT, GiaTien REAL, Image TEXT)";
        db.execSQL(sql);
        String data = "INSERT INTO SanPham VALUES(1, 'Cơm trộn', '50000', 'https://cdn.tgdd.vn/Files/2018/07/05/1099587/cach-lam-com-tron-han-quoc-bibimbap-ngon-nhu-nha-hang-202205241021184780.jpg')," +
                "(2, 'Cháo', '30000', 'https://cdn.tgdd.vn/2021/06/CookProduct/chaohenxaocay-1200x676.jpg')," +
                "(3, 'Gà rán', '90000', 'https://cdn.tgdd.vn/Files/2017/03/22/963765/cach-lam-ga-ran-thom-ngon-8_760x450.jpg')";
        db.execSQL(data);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        if (i != i1){
            db.execSQL("DROP TABLE IF EXISTS SanPham");
            onCreate(db);
        }
    }
}
