package com.example.toggle;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    View.OnClickListener

    {
        ImageView il, i2;


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1 = (ImageView) findViewById(R.id.ImageView1);
        i2 = (ImageView) findViewById(R.id.ImageView2);
        il.setOnClickListener(this);
        i2.setOnClickListener(this);
    }

    @Override
    public void OnClick(view v) {
        if (v.getId() == R.id.ImageView1) {
            il.setVisibility(View.GONE);
            i2.setVisibility(View.VISIBLE);

        } else {
            i2.setVisibility(View.GONE);
            i1.setVisibility(View.VISIBLE);

        }
    }
}


