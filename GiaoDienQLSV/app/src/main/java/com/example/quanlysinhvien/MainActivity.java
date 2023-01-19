package com.example.quanlysinhvien;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtHT, edtNS, edtTruong;
    Button btnNhapLai, btnN;
    RadioGroup rd;
    RadioButton rd1, rd2;
    CheckBox cb1, cb2, cb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtHT = findViewById(R.id.edtHT);
        edtNS = findViewById(R.id.edtNS);
        edtTruong = findViewById(R.id.edtTruong);

        btnNhapLai = findViewById(R.id.btnNhapLai);

        rd = findViewById(R.id.radg1);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);

        btnN = findViewById(R.id.btnNhapVaHT);

        rd1 = findViewById(R.id.rd1);
        rd2 = findViewById(R.id.rd2);

        String editTextHoTen = edtHT.getText().toString();
        String editTextNgaySinh = edtNS.getText().toString();
        String editTextTruong = edtTruong.getText().toString();
        btnNhapLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edtHT.setText(editTextHoTen);
                edtNS.setText(editTextNgaySinh);
                edtTruong.setText(editTextTruong);
                rd.clearCheck();
                if (cb1.isChecked())
                    cb1.toggle();
                if (cb2.isChecked())
                    cb2.toggle();
                if (cb3.isChecked())
                    cb3.toggle();
            }
        });

        
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HienThiTT.class);
                Bundle db = new Bundle();


                db.putString("HT",edtHT.getText().toString());
                db.putString("NS", edtNS.getText().toString());
                db.putString("T",edtTruong.getText().toString());

                if(rd1.isChecked())
                    db.putBoolean("GT0",true);
                if(rd2.isChecked())
                    db.putBoolean("GT1",true);


                if(cb1.isChecked())
                    db.putBoolean("ST1", true);
                if(cb2.isChecked())
                    db.putBoolean("ST2", true);
                if (cb3.isChecked())
                    db.putBoolean("ST3", true);

                intent.putExtras(db);
                startActivity(intent);
            }
        });


    }
}