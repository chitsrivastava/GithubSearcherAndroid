package com.dakshbhardwaj.GithubSearcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.dakshbhardwaj.GithubSearcher.controller.MainActivity;
import com.delaroystudios.javadevelopers.R;

public class HomeActivity extends AppCompatActivity {

    EditText Language,Location;
    Button Fetch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Language=(EditText)findViewById(R.id.language);
        Location=(EditText)findViewById(R.id.location);
        Fetch=(Button)findViewById(R.id.fetch);

        Fetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String GitLanguage= Language.getText().toString();
               String GitLocation=Location.getText().toString();
                Intent intent=new Intent(HomeActivity.this, MainActivity.class);
                intent.putExtra("GitLanguage",GitLanguage);
                intent.putExtra("GitLocation",GitLocation);
                startActivity(intent);
            }
        });

    }
}
