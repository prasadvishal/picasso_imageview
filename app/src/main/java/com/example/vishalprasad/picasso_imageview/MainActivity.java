package com.example.vishalprasad.picasso_imageview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


import static com.example.vishalprasad.picasso_imageview.R.id.imageView;


public class MainActivity extends Activity {
    ImageView iView; int pos=0;
    Button nxt, prev; TextView tv;
    ProgressBar pBar;
    ImageArray ob=new ImageArray();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iView = (ImageView) findViewById(imageView);
        nxt = (Button) findViewById(R.id.next);
        prev = (Button) findViewById(R.id.previous);
        tv = (TextView)findViewById(R.id.textView3);
        pBar = (ProgressBar)findViewById(R.id.progressBar);
        tv.setText("Click Next/Previous Button to start.");


        nxt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (pos == 4) {
                    pos = -1;
                }
                pos++;
                show();

            }


        });



        prev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (pos == 0) {
                    pos = 5;
                }
                pos--;
                show();

            }


        });
    }


        void show()
        {
            pBar.setVisibility(View.VISIBLE);
            tv.setText("Loading Image from server using picasso...");
            //Toast.makeText(getApplicationContext(),"Pos = "+pos, Toast.LENGTH_SHORT).show();
            Picasso.with(this).load(ob.getstring(pos))
                .placeholder(R.drawable.img)   // optional
                .error(R.drawable.error)      // optional
                //.resize(650, 950) optional
                .fit()
                .into(iView, new com.squareup.picasso.Callback() {
                    @Override
                    public void onSuccess() {
                        if (pBar != null) {
                            pBar.setVisibility(View.GONE);
                            tv.setText("");
                        }
                    }

                    @Override
                    public void onError() {

                    }
                });

        }


}

