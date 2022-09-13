package com.example.tuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edUser;
    EditText edPassword;
    String ten;
    String mk;
    Button btnDangnhap, btnDangki, btthoat , btdongy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();
        ControlButton();
    }

    private void ControlButton(){
        btnDangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setTitle("Hop thoai xu ly");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.dangki);
                EditText edittextNT = (EditText) findViewById(R.id.edittextNhapten);
                EditText edittextMK = (EditText) findViewById(R.id.edittextMatkhau);
                Button btthoat = (Button) findViewById(R.id.btnThoat);
                Button btdongy = (Button) findViewById(R.id.btnDongy);
                btdongy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ten = edittextNT.getText(). toString().trim();
                        mk = edittextMK.getText(). toString().trim();

                        edUser.setText(ten);
                        edPassword.setText(mk);

                        dialog.cancel();
                    }
                });
                btthoat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });
    }


    private void Anhxa(){
        btdongy =(Button) findViewById(R.id.btnDongy);
        btthoat =(Button) findViewById(R.id.btnThoat);
        edUser = (EditText) findViewById(R.id.editUser);
        edPassword = (EditText) findViewById(R.id.editPassword);
        btnDangnhap = (Button) findViewById(R.id.btnSignin);
        btnDangki = (Button) findViewById(R.id.btnSignup);
    }
}