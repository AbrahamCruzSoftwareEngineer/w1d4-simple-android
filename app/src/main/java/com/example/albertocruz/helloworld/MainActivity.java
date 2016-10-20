package com.example.albertocruz.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hello World Change Test
    }

    public void domagic(View view) {
        Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
        Log.d("TAG_", "doSomething: ");

        Intent intent = new Intent(this, details_activity.class);
        startActivity(intent);

        TextView textView = (TextView) findViewById(R.id.hello_txt1);
        textView.setText("Visa ready!");
    }

    public void domagic2(View view) {
        Toast.makeText(this, "Hello Atlanta", Toast.LENGTH_SHORT).show();
        Log.d("TAG_", "doSomething1: ");

        Intent intent = new Intent(this, details_activity.class);
        startActivity(intent);

        TextView textView = (TextView) findViewById(R.id.hello_txt2);
        textView.setText("Flying on Sunday");

    }

    public void domagic3(View view) {
        Toast.makeText(this, "Hello MobileApps", Toast.LENGTH_SHORT).show();
        Log.d("TAG_", "doSomething3: ");

        Intent intent = new Intent(this, details_activity.class);
        startActivity(intent);

        TextView textViewtxt1 = (TextView) findViewById(R.id.hello_txt1);
        textViewtxt1.setText("Hello World!");

        TextView textViewtxt2 = (TextView) findViewById(R.id.hello_txt2);
        textViewtxt2.setText("Hello Atlanta!");

    }
}
