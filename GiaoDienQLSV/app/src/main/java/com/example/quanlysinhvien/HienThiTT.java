package com.example.quanlysinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class HienThiTT extends AppCompatActivity {

    TextView txtHT, txtNS, txtT;
    CheckBox txtST1, txtST2, txtST3;
    RadioButton rd1, rd2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hien_thi_tt);

        txtHT = findViewById(R.id.txtHT);
        txtNS = findViewById(R.id.txtNS);
        txtT = findViewById(R.id.TXTT);
        txtST1 = findViewById(R.id.txtST1);
        txtST2 = findViewById(R.id.txtST2);
        txtST3 = findViewById(R.id.txtST3);

        rd1 = findViewById(R.id.rd1);
        rd2 = findViewById(R.id.rd2);








        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String HT = bundle.getString("HT", "sai key ho ten");
            String namS = bundle.getString("NS", "sai key nam sinh");
            String Truong = bundle.getString("T", "sai key truong");


            boolean rad1 = bundle.getBoolean("GT0", false);
            boolean rad2 = bundle.getBoolean("GT1", false);



            boolean ST1 = bundle.getBoolean("ST1");
            boolean ST2 = bundle.getBoolean("ST2");
            boolean ST3 = bundle.getBoolean("ST3");




            txtHT.setText(HT);
            txtNS.setText(namS);
            txtT.setText(Truong);

            rd1.setChecked(rad1);
            rd2.setChecked(rad2);
            rd1.setEnabled(false);
            rd2.setEnabled(false);


            txtST1.setChecked(ST1);
            txtST1.setEnabled(false);
            txtST2.setChecked(ST2);
            txtST2.setEnabled(false);
            txtST3.setChecked(ST3);
            txtST3.setEnabled(false);

        }
    }
}