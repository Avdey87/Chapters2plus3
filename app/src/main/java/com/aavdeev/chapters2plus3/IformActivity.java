package com.aavdeev.chapters2plus3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IformActivity extends Activity {

    public static final String INFO = "info";
    public static final String LIST = "list";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iform);

        TextView info = findViewById(R.id.info);
        Intent getInfo = getIntent();
        String textInfo = getInfo.getStringExtra(INFO);
        info.setText(textInfo);

        TextView list = findViewById(R.id.list_item);
        Intent getList = getIntent();
        String textList = getList.getStringExtra(LIST);
        list.setText(textList);

    }
}
