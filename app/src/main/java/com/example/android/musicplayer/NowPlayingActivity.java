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

        /** Gather intent extras */
        String chosenAlbum = getIntent().getStringExtra("ALBUM");
        int chosenArtwork = Integer.parseInt(getIntent().getStringExtra("ARTWORK"));
        String chosenTitle = getIntent().getStringExtra("TITLE");
        String chosenArtist = getIntent().getStringExtra("ARTIST");

        /** Populate XML with gathered intent extras from SongActivity */
        TextView playingAlbumTextView = findViewById(R.id.playing_album_text_view);
        playingAlbumTextView.setText(chosenAlbum);

        ImageView playingArtworkImgView = findViewById(R.id.playing_artwork_img_view);
        playingArtworkImgView.setImageResource(chosenArtwork);

        TextView playingTitleTextView = findViewById(R.id.playing_title_text_view);
        playingTitleTextView.setText(chosenTitle);

        TextView playingArtistTextView = findViewById(R.id.playing_artist_text_view);
        playingArtistTextView.setText(chosenArtist);

    }
}
