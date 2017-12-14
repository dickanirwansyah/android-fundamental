package com.dicka.spring.fundamental_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //elemen button
    private Button btnTambah;
    private Button btnKali;
    private Button btnKurang;
    private Button btnBagi;


    //elemet Textview
    private TextView textViewHasil;

    //element editText
    private EditText editTextMasukkanNilai1;
    private EditText getEditTextMasukkanNilai2;

    Integer inputNilai1;
    Integer inputNilai2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button
        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnKali  = (Button) findViewById(R.id.btnKali);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnTambah = (Button) findViewById(R.id.btnTambah);

        //edit text
        editTextMasukkanNilai1 = (EditText) findViewById(R.id.etMasukkanNilai1);
        getEditTextMasukkanNilai2 = (EditText) findViewById(R.id.etMasukkanNilai2);

        //textview
        textViewHasil = (TextView) findViewById(R.id.textViewHasil);

        //onclick btnTambah
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prosesTambah();
            }
        });

        //onclick btnkali
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prosesKali();
            }
        });

        //onClick btnkurang
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prosesKurang();
            }
        });

        //onClick btnBagi
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prosesBagi();
            }
        });
    }


    public void prosesKurang(){
        if(editTextMasukkanNilai1.getText().toString().isEmpty()){
            Toast.makeText(this, "nilai satu masih kosong harap diisi !", Toast.LENGTH_LONG).show();
        }else if(getEditTextMasukkanNilai2.getText().toString().isEmpty()){
            Toast.makeText(this, "nilai dua masih kosong harap diisi !", Toast.LENGTH_LONG).show();
        }else{

            inputNilai1 = Integer.parseInt(editTextMasukkanNilai1.getText().toString());
            inputNilai2 = Integer.parseInt(getEditTextMasukkanNilai2.getText().toString());

            Integer hasil = inputNilai1 - inputNilai2;
            textViewHasil.setText(String.valueOf(hasil));
        }
    }


    public void prosesBagi(){
        if(editTextMasukkanNilai1.getText().toString().isEmpty()){
            Toast.makeText(this, "nilai satu masih kosong harap diisi !", Toast.LENGTH_LONG).show();
        }else if(getEditTextMasukkanNilai2.getText().toString().isEmpty()){
            Toast.makeText(this, "nilai dua masih kosong harap diisi !", Toast.LENGTH_LONG).show();
        }else{

            inputNilai1 = Integer.parseInt(editTextMasukkanNilai1.getText().toString());
            inputNilai2 = Integer.parseInt(getEditTextMasukkanNilai2.getText().toString());

            Integer hasil = inputNilai1 / inputNilai2;
            textViewHasil.setText(String.valueOf(hasil));
        }
    }

    public void prosesKali(){
        if(editTextMasukkanNilai1.getText().toString().isEmpty()){
            Toast.makeText(this, "nilai satu masih kosong harap diisi !", Toast.LENGTH_LONG).show();
        }else if(getEditTextMasukkanNilai2.getText().toString().isEmpty()){
            Toast.makeText(this, "nilai dua masih kosong harap diisi !", Toast.LENGTH_LONG).show();
        }else{

            inputNilai1 = Integer.parseInt(editTextMasukkanNilai1.getText().toString());
            inputNilai2 = Integer.parseInt(getEditTextMasukkanNilai2.getText().toString());

            Integer hasil = inputNilai1 * inputNilai2;
            textViewHasil.setText(String.valueOf(hasil));
        }
    }


    public void prosesTambah(){
        if(editTextMasukkanNilai1.getText().toString().isEmpty()){
            Toast.makeText(this, "nilai satu masih kosong harap diisi !", Toast.LENGTH_LONG).show();
        }else if(getEditTextMasukkanNilai2.getText().toString().isEmpty()){
            Toast.makeText(this, "nilai dua masih kosong harap diisi !", Toast.LENGTH_LONG).show();
        }else{
            inputNilai1 = Integer.parseInt(editTextMasukkanNilai1.getText().toString());
            inputNilai2 = Integer.parseInt(getEditTextMasukkanNilai2.getText().toString());

            Integer hasil = inputNilai1 + inputNilai2;
            textViewHasil.setText(String.valueOf(hasil));
        }
    }

}
