package com.example.mygithubfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initView();
        initOnClick();
        initBug();
    }

    /**
     * 处理bug
     */
    private void initBug() {
        Toast.makeText(TestActivity.this, "bug开发分支,bug处理完后合并到稳定的版本", Toast.LENGTH_LONG).show();
        //此版本进行bug版本处理   处理完bug完后进行合并即可  然后可以删除此bug版本
        //修改了bug
    }

    private void initOnClick() {

    }

    private void initView() {
        Toast.makeText(TestActivity.this, "hahah", Toast.LENGTH_LONG).show();
    }
}
