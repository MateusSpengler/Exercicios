package com.pichuproductions.logi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,"Create",Toast.LENGTH_SHORT).show();

        Button botao = findViewById(R.id.Salvar);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Salvo",Toast.LENGTH_SHORT).show();
                Log.i("CicloDeVida", "Salvo");

            }
        });
    }

        @Override
        protected void onStart() {
            super.onStart();
            Log.i("CicloDeVida", "OnStar");
            Toast.makeText(MainActivity.this,"Star",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.i("CicloDeVida","OnPause");
            Toast.makeText(MainActivity.this,"Pause",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.i("CicloDeVida","OnStop");
            Toast.makeText(MainActivity.this,"Stop",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.i("CicloDeVida","OnDestry");
            Toast.makeText(MainActivity.this,"Destroy",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.i("CicloDeVida","OnResume");
            Toast.makeText(MainActivity.this,"Resume",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.i("CicloDeVida","OnRestart");
            Toast.makeText(MainActivity.this,"Restart",Toast.LENGTH_SHORT).show();
        }
    }


