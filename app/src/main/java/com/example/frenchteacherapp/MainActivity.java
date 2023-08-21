package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button blackBtn,yellowBtn,redBtn,purpleBtn,greenBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBtn=findViewById(R.id.blackBtn);
        redBtn=findViewById(R.id.redBtn);
        yellowBtn=findViewById(R.id.yellowBtn);
        purpleBtn=findViewById(R.id.purpleBtn);
        greenBtn=findViewById(R.id.greenBtn);


        redBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        int clickedBtnId=view.getId();

        if(clickedBtnId == R.id.redBtn){
           PlaySounds(R.raw.red);
        } else if(clickedBtnId==R.id.blackBtn){
            PlaySounds(R.raw.black);
        }
        else if(clickedBtnId==R.id.greenBtn){
            PlaySounds(R.raw.green);
        }
        else if(clickedBtnId==R.id.yellowBtn){
            PlaySounds(R.raw.yellow);
        }
        else if( clickedBtnId==R.id.purpleBtn){
            PlaySounds(R.raw.purple);
        }

    }
    public void PlaySounds(int id){
        MediaPlayer mediaPlayer =MediaPlayer.create(
                this,
                id
        );
        mediaPlayer.start();

    }
}