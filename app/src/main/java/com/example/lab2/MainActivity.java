package com.example.lab2;

import static com.example.lab2.CountFunctions.CountChars;
import static com.example.lab2.CountFunctions.CountWords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.Spinner1);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Count words");
        arrayList.add("Count characters");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.toast_text);
        int duration = Toast.LENGTH_SHORT;
        toast = Toast.makeText(context, text, duration);
    }

    public void OnButton1Click(View view) {
        EditText tEdit1 = findViewById(R.id.EditText1);
        TextView tView1 = findViewById(R.id.TextView1);
        String textFromTextView = tEdit1.getText().toString();
        if (textFromTextView.equals("")){
            toast.show();
        }
        else {
            if (spinner.getSelectedItem().toString().equals("Count words")) {
                tView1.setText(getString(R.string.result) + CountWords(textFromTextView) + getString(R.string.words));
            }
            else {
                tView1.setText(getString(R.string.result) + CountChars(textFromTextView) + getString(R.string.characters));
            }
        }
    }
}