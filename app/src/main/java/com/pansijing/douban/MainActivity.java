package com.pansijing.douban;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.pansijing.douban.movies.MovieActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.next)
    TextView next;
    @BindView(R.id.fragment_container)
    FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MovieActivity.class));
            }
        });
    }
}
