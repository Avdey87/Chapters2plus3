package com.aavdeev.chapters2plus3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Chpter2plus3Activity extends Activity {

    private ListCars cars = new ListCars();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chpter2plus3);

        Spinner contries = findViewById(R.id.spinner);
        TextView brands = findViewById(R.id.cars_list);

        String getConties = String.valueOf(contries.getSelectedItem());

        List<String> carsList = cars.getListCars(getConties);

        StringBuilder sb = new StringBuilder();

        for (String brand : carsList) {
            sb.append(brand).append('\n');
        }

        brands.setText(sb);
    }

    public void onClickActivity(View view) {
        EditText editText = findViewById(R.id.edit_text);
        String messageInfo = editText.getText().toString();
        Intent actIntent = new Intent(this, IformActivity.class);
        actIntent.putExtra(IformActivity.INFO, messageInfo);
        startActivity(actIntent);
    }

    public void onClickIntent(View view) {
        EditText editText = findViewById(R.id.edit_text);
        String messageInfo = editText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        Intent cngIntent = Intent.createChooser(intent, "Метод отправки");
        intent.putExtra(Intent.EXTRA_TEXT, messageInfo);
        intent.setType("text/plain");
        startActivity(cngIntent);
    }


}
