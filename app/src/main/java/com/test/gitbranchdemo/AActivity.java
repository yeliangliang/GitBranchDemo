package com.test.gitbranchdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class AActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1. 新建工程，即master分支，先将其上传到git远程
        //2. 从master分支新建developer分支
    }
}
