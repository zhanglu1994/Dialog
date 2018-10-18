package com.zl.dialog;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.zl.dialog.dialog.AlertController;
import com.zl.dialog.dialog.AlertDialog;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView tv_main = findViewById(R.id.tv_main);


        tv_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
                        .setContentView(R.layout.detail_comment_dialog)
                        .fullWidth()
                        .formBottom(true)
                        .setText(R.id.submit_btn,"发送")
                        .setOnClickListener(R.id.account_icon_weibo, new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this,"微博被点击啦！",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();



            }
        });


    }



}
