package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        String playingAlbum = getIntent().getStringExtra("ALBUM");
        int playingArtwork = Integer.parseInt(getIntent().getStringExtra("ARTWORK"));
        String playingTitle = getIntent().getStringExtra("TITLE");
        String playingArtist = getIntent().getStringExtra("ARTIST");

        TextView playingAlbumTextView = findViewById(R.id.playing_album_text_view);
        playingAlbumTextView.setText(playingAlbum);

        ImageView playingArtworkImgView = findViewById(R.id.playing_artwork_img_view);
        playingArtworkImgView.setImageResource(playingArtwork);

        TextView playingTitleTextView = findViewById(R.id.playing_title_text_view);
        playingTitleTextView.setText(playingTitle);

        TextView playingArtistTextView = findViewById(R.id.playing_artist_text_view);
        playingArtistTextView.setText(playingArtist);

    }
}
