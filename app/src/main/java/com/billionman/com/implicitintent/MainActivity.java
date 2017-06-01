package com.billionman.com.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    public static String GOOGLE_URL = "https://google.co.in/#q=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToGoogle(View view) {
        EditText txt = (EditText) findViewById(R.id.editText2);
        String searchData = String.valueOf(txt.getText());
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(GOOGLE_URL+ Uri.encode(searchData)));
        startActivity(intent);
    }
}
