package com.example.mahendran.test;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayer extends Activity {

    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        VideoView videoView= (VideoView) findViewById(R.id.VideoPlayer);


        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        String uriPath = "android.resource://com.example.mahendran.test/"+R.raw.abc;

        Uri uri = Uri.parse(uriPath);
        videoView.setVideoURI(uri);
        mediaController.requestFocus();
        videoView.start();



    }
}
