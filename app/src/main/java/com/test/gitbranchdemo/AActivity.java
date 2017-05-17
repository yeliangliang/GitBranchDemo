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
        //3. 提交一次developer分支（为了便于观察）
        //4. 正在改动developer分支上的代码的时候master分支出现了紧急bug


        //n. 现在在bugbranch分支上修复了master上的紧急bug
    }
}
