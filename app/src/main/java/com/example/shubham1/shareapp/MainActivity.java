package com.example.shubham1.shareapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shubham1.shareapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

private Button btn_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setShareButton();  //call the method

    }

    private void setShareButton()
    {
        btn_share=findViewById(R.id.btn_share);
    btn_share.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String sharebody="https://github.com/rksmalhotra0002/";
            intent.putExtra(Intent.EXTRA_TEXT,sharebody);
            startActivity(Intent.createChooser(intent,"Share using"));
        }
    });
    }
    }

