package com.yourdeveloeperhere.bottomsheetandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    Button button;
    BottomSheetDialog sheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheetDialog=new BottomSheetDialog(MainActivity.this,R.style.AppBottomSheetDialogTheme) ;

                sheetDialog.setContentView(R.layout.sheet_layout);

                sheetDialog.show();
            }
        });
    }
}