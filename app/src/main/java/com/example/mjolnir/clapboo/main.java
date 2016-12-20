package com.example.mjolnir.clapboo;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class main extends Activity {
    private MediaPlayer mPlayer = null;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btn_sound_1up = (Button) findViewById(R.id.btn_sound_1up);
        btn_sound_1up.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.up);
            }

        });

        Button btn_sound_coin = (Button) findViewById(R.id.btn_sound_coin);
        btn_sound_coin.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.coin);
            }

        });

        Button btn_sound_boo = (Button) findViewById(R.id.btn_sound_boo);
        btn_sound_boo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.boo);
            }

        });

        Button btn_sound_wilhelmscream = (Button) findViewById(R.id.btn_sound_wilhelmscream);
        btn_sound_wilhelmscream.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.wilhelmscream);
            }

        });

        Button btn_sound_patrick = (Button) findViewById(R.id.btn_sound_patrick);
        btn_sound_patrick.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.patrick);
            }

        });

        Button btn_sound_nelson = (Button) findViewById(R.id.btn_sound_nelson);
        btn_sound_nelson.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.nelson);
            }

        });

        /*Button btn_sound_? = (Button) findViewById(R.id.btn_sound_?);
        btn_sound_?.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.?);
            }

        });*/

        Button btn_sound_yeeaah = (Button) findViewById(R.id.btn_sound_yeeaah);
        btn_sound_yeeaah.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.yeeaah);
            }

        });

        Button btn_sound_fuckoff = (Button) findViewById(R.id.btn_sound_fuckoff);
        btn_sound_fuckoff.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.fuckoff);
            }

        });

        Button btn_sound_legendary = (Button) findViewById(R.id.btn_sound_legendary);
        btn_sound_legendary.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.legendary);
            }

        });

        Button btn_sound_badumtss = (Button) findViewById(R.id.btn_sound_badumtss);
        btn_sound_badumtss.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.badumtss);
            }

        });

        Button btn_sound_wololo = (Button) findViewById(R.id.btn_sound_wololo);
        btn_sound_wololo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.wololo);
            }

        });

        Button btn_sound_punch = (Button) findViewById(R.id.btn_sound_punch);
        btn_sound_punch.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.punch);
            }

        });


        Button btn_sound_clap = (Button) findViewById(R.id.btn_sound_clap);
        btn_sound_clap.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.clap);
            }

        });

        Button btn_sound_chewbacca = (Button) findViewById(R.id.btn_sound_chewbacca);
        btn_sound_chewbacca.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.chewbacca);
            }

        });

        Button btn_sound_jobsdone = (Button) findViewById(R.id.btn_sound_jobsdone);
        btn_sound_jobsdone.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.jobsdone);
            }

        });

    }

    @Override
    public void onPause() {
        super.onPause();
        if(mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }
    }

    private void playSound(int resId) {
        if(mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }
        mPlayer = MediaPlayer.create(this, resId);
        mPlayer.start();
    }
}
			